package recurssion;

import java.util.Scanner;

public class factorial {
    
    static int fact(int n){

      if(n==0){
        return 1;
      }
        int res= n * fact(n-1);
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int q = fact(r);

        System.out.println(q);
        scn.close();
    }
}
