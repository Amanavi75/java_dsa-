package gui;
import javax.swing.*;

import java.awt.Color;

public class frames {
   public static void main (String[] args){
    JFrame f = new JFrame("this is my first frame");
    f.setSize(700,600);
    f.setResizable(true);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   //* used to do nothing even after  pressing the close button and application will be still running in the background */
    //f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    //* used to hide the frame or interface after clicking on the cross button  application will be still running in the background  */

    //f.getContentPane().setBackground(Color.red);
    f.getContentPane().setBackground(new Color(0,110,110));
    JFrame.setDefaultLookAndFeelDecorated(true);
    f.setLayout(null);
    f.setVisible(true);

   } 
}
