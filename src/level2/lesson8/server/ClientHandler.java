package level2.lesson8.server;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.currentTimeMillis;

public class ClientHandler {
    private String name;
    private DataInputStream in;
    private DataOutputStream out;
    private Socket socket;
    private Chat chat;
    private boolean checkPeriod = false;
    private ExecutorService executorService = Executors.newCachedThreadPool();

    public ClientHandler(Socket socket, Chat chat) {
        this.socket = socket;
        this.chat = chat;
        try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }

        listen();
    }

    public String getName() {
        return name;
    }

    private void listen() {
        executorService.submit(() -> {
            checkAuthPeriod();
            doAuth();
            receiveMessage();
        });
    }

    private synchronized void checkAuthPeriod() {
        long startTime = currentTimeMillis() / 1000;
        long period = 30;
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                sendMessage(String.format("[INFO] You didn't register! Connection will close after %s second", period));
                while ((currentTimeMillis() / 1000 - startTime) <= period) ;
                if (checkPeriod) {
                    return;
                } else {
                    try {
                        sendMessage("[INFO] Your session is closed!");
                        Thread.sleep(3000);
                        socket.close();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private synchronized void doAuth() {
        sendMessage("Please enter credentials. Sample [-auth login password]");
        try {
            /**
             * -auth login password
             * sample: -auth l1 p1
             */
            while (true) {
                String mayBeCredentials = in.readUTF();
                if (mayBeCredentials.startsWith("-auth")) {
                    String[] credentials = mayBeCredentials.split("\\s");
                    String mayBeNickname = chat.getAuthenticationService()
                            .findNicknameByLoginAndPassword(credentials[1], credentials[2]);
                    if (mayBeNickname != null) {
                        if (!chat.isNicknameOccupied(mayBeNickname)) {
                            sendMessage("[INFO] Auth OK");
                            name = mayBeNickname;

                            chat.broadcastMessage(String.format("[%s] logged in", name));
                            chat.subscribe(this);

                            checkPeriod = true;

                            return;
                        } else {
                            sendMessage("[INFO] Current user is already logged in.");
                        }
                    } else {
                        sendMessage("[INFO] Wrong login or password.");
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }

    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    public synchronized void receiveMessage() {
        this.sendMessage(readHistoryFromFile("chat.txt"));
        while (true) {
            try {
                String message = in.readUTF();

                if (message.startsWith("-exit")) {
                    chat.unsubscribe(this);
                    chat.broadcastMessage(String.format("[%s] logged out", name));
                    executorService.shutdownNow();
                    break;
                }
                if (message.startsWith("-ch")) {
                    String oldName = this.getName();
                    String newName = message.split("\\s")[1];
                    if (!chat.isNicknameOccupied(newName)) {
                        chat.getAuthenticationService().updateNickname(newName, oldName);
                        this.setName(newName);
                    } else {
                        System.out.println("[INFO] Current user is already logged in.");
                    }
                }
                chat.broadcastMessage(String.format("[%s]: %s", name, message));
                writeHistoryInToTheFile(new File("chat.txt"), String.format("[%s]: %s", name, message));
            } catch (IOException e) {
                throw new RuntimeException("SWW", e);
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized String readHistoryFromFile(String fileName) {
        String line;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(checkFileExist(fileName)))) {
            while ((line = br.readLine()) != null) {
                sb.append("\r\n").append(line);
            }
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
        return read100LinesFromFile(sb.toString());
    }

    private String read100LinesFromFile(String result) {
        String[] resultMass = result.split("\r\n");
        String returnResult = result;
        if (resultMass.length >= 100) {
            returnResult = readFromFileMoreThen100Lines(resultMass);
        }
        return returnResult;
    }

    private String readFromFileMoreThen100Lines(String[] resultMass) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resultMass.length; i++) {
            if (i > resultMass.length - 100) {
                sb.append("\r\n").append(resultMass[i]);
            }
        }
        return sb.toString();
    }

    public synchronized void writeHistoryInToTheFile(File file, String value) {
        checkFileExist(file.getAbsolutePath());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.newLine();
            bw.write(value);
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }

    File checkFileExist(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                Files.createFile(Paths.get(fileName));
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            }
        }
        return file;
    }
}