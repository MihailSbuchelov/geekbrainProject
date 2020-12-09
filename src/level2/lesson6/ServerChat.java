package level2.lesson6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ServerChat implements Chat {
    private ServerSocket serverSocket;
    private Set<ClientHandler> clients;

    public ServerChat() {
        try {
            serverSocket = new ServerSocket(7777);
            clients = new HashSet<>();
            serverTalked();
            while (true) {
                System.out.println("Server is waiting for a connection ...");
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket, this);
                System.out.println(String.format("[%s] Client[%s] is successfully logged in", new Date(), clientHandler.getName()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void serverTalked() {
        new Thread(() -> {
            Scanner scanner;
            while (!serverSocket.isClosed()) {
                scanner = new Scanner(System.in);
                String words = scanner.nextLine();
                this.broadcastMessage("[Server]: " + words);
            }
        }).start();
    }

    @Override
    public void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
        System.out.println(message);
    }

    @Override
    public void subscribe(ClientHandler client) {
        clients.add(client);
    }

    @Override
    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }
}