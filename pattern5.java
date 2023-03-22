package pattern;
import java.util.*;
public class pattern5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
                
            }
            System.out.println("\t");
        }


    }


}
