package recurssion;
import java.util.*;
public class printn {
    static void increasingInt(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }

        increasingInt(n-1);
        System.out.println(n);
    }

    static void decreasingInt(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }

        System.out.println(n);
        increasingInt(n-1);
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        increasingInt(n);
        scn.close();
    }
    
}



