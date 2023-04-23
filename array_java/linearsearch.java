package array;
import java.util.*;
public class linearsearch {
    public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int [] arr = new int[n];
      for(int i =0;i<arr.length;i++){
        arr[i]=scn.nextInt();
      }
      int idx=-1;
      int data = scn.nextInt();
      for (int i=0;i<arr.length;i++){
        if (arr[i]==data){
             idx = i;
             break;
        }
      }
      System.out.println(idx);
      scn.close();
    }
}


//from line 14 to 17 -  search alogrithm we will match data with every index ,after getting it we will print the index no 
