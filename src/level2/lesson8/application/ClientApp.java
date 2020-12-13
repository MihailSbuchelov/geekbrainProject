package level2.lesson8.application;

import level2.lesson8.client.ClientChatAdapter;

public class ClientApp {
    public static void main(String[] args) {
        new ClientChatAdapter("localhost", 8888);
    }
}
