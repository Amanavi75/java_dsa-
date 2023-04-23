package basic;
import java.util.*;
public class pritncountofdigit {
     public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nod = 0;
        int temp=n;
        while (temp!=0){
            temp=temp/10;
            nod++;
        }
        System.out.println(nod);
        scn.close();


     }
}
