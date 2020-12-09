package level2.lesson6.application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApplication {
    public static void main(String[] args) {
        Socket socket;
        try {
            socket = new Socket("127.0.0.1", 7777);
            System.out.println("You connected the server");
            System.out.println(String.format("Host: %s, port: %s", "127.0.0.1", 7777));
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                System.out.println("You are ready for dialog. Enter the message..");
                while (true) {
                    try {
                        System.out.println(in.readUTF());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            Scanner scanner = new Scanner(System.in);
            while (!socket.isClosed()) {
                out.writeUTF(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}