package level2.lesson7;

public interface Chat {
    void broadcastMessage(String message);

    boolean isNicknameOccupied(String nickname);

    void subscribe(ClientHandler client);

    void unsubscribe(ClientHandler client);

    AuthenticationService getAuthenticationService();

    void sendPersonalMessage(String message);
}
