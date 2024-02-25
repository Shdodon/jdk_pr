package hw1;

import hw1.client.ClientGUI;
import hw1.server.ServerGUI;


public class Program {
    public static void main(String[] args) {
        ServerGUI serverGUI = new ServerGUI();
        new ClientGUI(serverGUI);
        new ClientGUI(serverGUI);
    }
}
