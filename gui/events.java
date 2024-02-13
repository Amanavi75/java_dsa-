package gui;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
class event{
public static void main(String... shruti)
{
JFrame f=new JFrame("Text Feild application");
JButton b=new JButton("Push Button");
b.setBounds(15,15,100,100);
b.setForeground(Color.red);
JTextField tf1=new JTextField();
tf1.setBounds(120,120,100,150);
tf1.setBackground(Color.black);
tf1.setForeground(Color.cyan);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
tf1.setText("Hello aman");
}
});
f.add(b);
f.add(tf1);
f.setSize(500,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(Color.yellow);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
}
