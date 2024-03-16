package recurssion;
import java.util.*;
public class kmultiples {
    
    static void kmulti(int n,int m){

        if(m==1){
            System.out.println(n);
            return ;
        }

       kmulti(n, m-1);

       System.out.println(n*m);


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        kmulti(n, k);

        scn.close();
    }
}
