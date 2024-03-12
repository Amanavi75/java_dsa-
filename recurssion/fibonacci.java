package recurssion;

import java.util.Scanner;

//every next number is sum of last two number 
public class fibonacci {
    static int fib(int n){

        if(n==0 ){
            return 0;
        }

        if(n==1){
            return 1;
        }
       int result = fib(n-1) + fib(n-2);

       return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int p =fib(n);
       System.out.println(p);
       scn.close();
    }
}


