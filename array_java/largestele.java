package array;
import java.util.*;
public class largestele {
    public static void main(String args[]){
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           
           int [] arr = new int[n];
           for (int i=0;i<arr.length;i++){
               arr[i]=scn.nextInt();
            
           }
           int result=arr[0];
           for (int i=1;i<arr.length;i++){
            if(arr[i]>result){
                result=i;   
            }
           
        }
           System.out.print(result);
           scn.close();
    }
}
