package recurssion;

import java.util.Scanner;

public class seriesSum {

    static int nSum(int n ){
        if(n==0){
            return 0;
        }

        return nSum(n-1) + n;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(nSum(n));

        scn.close();
    }
}
