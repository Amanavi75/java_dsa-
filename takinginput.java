package basic;
import java.util.*; 

public class takinginput {
    public static void main(String[] args ) {
        Scanner scn= new Scanner (System.in);
        int n= scn.nextInt() ;
        for (int i=0;i<n;i++) {
            System.out.println(i);
        }
        scn.close();


    }
}
