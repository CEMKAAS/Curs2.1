import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8989);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            String serverBegin = in.readLine();
            Scanner scanner = new Scanner(System.in);
            System.out.println(serverBegin);

            String dataEntry = scanner.nextLine();
            String[] dataEntryParts = dataEntry.split(" ");

            String title = dataEntryParts[0];
            String date = dataEntryParts[1];
            Integer price = Integer.valueOf(dataEntryParts[2]);

            Gson gson = new Gson();
            Category category = new Category(title, date, price);
            out.println(gson.toJson(category));
            String output = in.readLine();
            System.out.println(output);

        } catch (
                IOException e) {
            System.out.println("Не могу стартовать сервер");
            e.printStackTrace();
        }
    }
}