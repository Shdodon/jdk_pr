package hw1;

import hw1.client.Client;
import hw1.server.ServerWindow;

public class Program {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();

        new Client(serverWindow);
        new Client(serverWindow);

    }
}
