package javaNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("Enter 'terminate to end chat:'");
            System.out.println("Start chats: ");

            String chat = "";

            while(!chat.equals("terminate")){
                chat = new Scanner(System.in).nextLine();
                out.println(chat);
                String response = in.readLine();
                System.out.println("Server Response: " + response);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
