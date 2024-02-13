package gui;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class textfield {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("text field application");
        JPanel p = new JPanel();
        p.setBounds(15,15,120,50);
        JTextField tf = new JTextField("hello brotheer");
        tf.setBounds(20,20,100,150);
        tf.setBackground(Color.black);
        tf.setForeground(Color.white);
        p.add(tf);
        JPanel p1 = new JPanel();
        p1.setBounds(150,150,160,40);
        JTextField tf1 = new JTextField("hello sir ");
        tf1.setBounds(150,150,100,200);
        tf1.setBackground(Color.green);
        tf1.setForeground(Color.white);
        p1.add(tf1);

        f.add(p);
        f.add(p1);

        f.setSize(600,600);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.yellow);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
