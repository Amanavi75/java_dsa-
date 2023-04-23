package array;
import java.util.*;
public class removeduplicatefromsorted {
    public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      
      int n=scn.nextInt();
      int [] arr =new int [n];
      int result=1;
      for(int i=0;i<arr.length;i++){
        arr[i] =scn.nextInt();
      }
      for(int i=1;i<n;i++){
        if(arr[i]!=arr[result-1]){
            arr[result]=arr[i];
            result++;
        }
        
      }for(int i=0;i<result;i++){
        System.out.print(arr[i]+" ");
      }

      scn.close();
    }
}
