package basic;
import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int p =scn.nextInt();
         while(p>0){
            int dig =p%10;
            p= p/10;
            System.out.print(dig);
         }
         scn.close();
         

    }
}
