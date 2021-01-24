package level2.lesson6;

public interface Chat {
    void broadcastMessage(String message);

    void subscribe(ClientHandler client);

    void unsubscribe(ClientHandler client);

}