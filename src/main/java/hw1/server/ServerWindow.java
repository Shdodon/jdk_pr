package hw1.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private static final int POS_X = 500;
    private static final int POS_Y = 500;
    private static final int WIDTH = 500;
    private static final int HEIGHT  = 500;

    private FileLog serverLog;

    public FileLog getServerLog() {
        return serverLog;
    }

    //private static final String pathLog = "D:\\GB\\Java Core\\Client_Server_msg\\src\\main\\java\\server\\log.txt";
    private final JButton btnStart = new JButton("Start");
    private final JButton btnStop = new JButton("Stop");
    private final JTextArea log = new JTextArea();

    private boolean isServerWorking;
    private boolean newMessage;

    public static void main(String[] args) {
        new ServerWindow();
    }

    public void setNewMessage(boolean newMessage) {
        this.newMessage = newMessage;
    }


    public boolean isNewMessage() {
        return newMessage;
    }

    public ServerWindow() {
        isServerWorking = false;

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = false;
                System.out.println("Server stopped " + isServerWorking + "\n");
                log.append("Server stopped \n");
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                System.out.println("Server started " + isServerWorking + "\n");
                log.append("Server started \n");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        serverLog = new FileLog();
        setAlwaysOnTop(true);
        setLayout(new GridLayout(3, 2));
        add(log, BorderLayout.NORTH);
        add(btnStart);
        add(btnStop);

        setVisible(true);

    }

    public boolean isServerWorking() {
        return isServerWorking;
    }


}
