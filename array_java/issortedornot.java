package array;
import java.util.*;
public class issortedornot {
    public static void main (String args[] ){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
             arr[i]=scn.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            if(arr[1]<arr[i-1]){
                System.out.println("array is sorted ");
            } 
            
        }
    
        scn.close();
        

    }
}
