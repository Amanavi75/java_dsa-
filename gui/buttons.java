package gui;
import javax.swing.*;

import java.awt.Color;
public class buttons {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button applicaton");
        JButton b = new JButton("click me");
        b.setBounds(60,60,100,50);
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);
        f.add(b);
        f.setSize(500,500);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(0,110,110));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
