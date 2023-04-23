package array;
import java.util.*;
public class leaderelement {

    public static void main(String args[] ){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int [] arr= new int[n];
       for(int i=0;i<=arr.length;i++){
        arr[i]=scn.nextInt();
       }
       int max = arr[n-1];
       System.out.println(max+" ");
         for (int i= n-2;i>=0;i--){
            if(max<arr[i]){
                max = arr[i];
            }
            System.out.println(max+" ");
         }
         scn.close();
    }
}
