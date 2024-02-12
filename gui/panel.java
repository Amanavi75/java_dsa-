package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.setBounds(40, 50, 250, 200);
        p.setBackground(Color.green);
        JButton b = new JButton("push");
        b.setBounds(20, 20, 100, 50);
        b.setForeground(Color.white);
        b.setBackground(Color.black);
        p.add(b);
        JPanel p1 = new JPanel();
        p1.setBounds(80, 100, 200, 210);
        p1.setBackground(Color.red);
        f.add(p);
        f.add(p1);
        f.setSize(600,600);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(50,160,160));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }
}
