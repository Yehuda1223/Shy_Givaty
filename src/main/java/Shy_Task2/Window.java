package Shy_Task2;

import javax.swing.*;

import static Shy_Task2.MyRobot.OpenWhatsapp;

public class Window extends JPanel {
    public static boolean IsConect;
    public boolean Test;
    public static final int WINDOW_HIGHT = 500;
    public static final int WINDOW_WITGH = 500;
    Boolean isconect = false;

    public static void main(String[] args) throws InterruptedException {
        Window();

    }

    public static void Window() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setBounds(0, 0, 500, 500);
        JButton button = new JButton("click here");
        button.setBounds(200, 200, 100, 100);
        frame.add(button);


        button.addActionListener((event) -> {

            try {
                OpenWhatsapp();
                frame.dispose();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });


    }

}
