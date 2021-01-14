package level2.lesson8.client;

import level2.lesson8.gui.ChatFrame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class ClientChatAdapter {
    private ChatFrame chatFrame;
    private Client client;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public ClientChatAdapter(String host, int port) {
        client = new Client(host, port);
        chatFrame = new ChatFrame(new Consumer<String>() {
            @Override
            public void accept(String messageFromFormSubmitListener) {
                client.sendMessage(messageFromFormSubmitListener);
            }
        });
        read();
    }

    private void read() {
        executorService.submit(() -> {
            try {
                while (true) {
                    chatFrame.append(
                            client.receiveMessage()
                    );
                }
            } catch (ClientConnectionException e) {
                throw e;
            } finally {
                if (client != null) {
                    client.close();
                    System.exit(0);
                }
            }
        });
    }

    public void shutDownExecService() {
        executorService.shutdownNow();
    }
}
