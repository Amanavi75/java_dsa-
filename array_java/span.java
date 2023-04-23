//span - fisrt of all we will find the max and min element element of the array and after that we will substract max- min

package array;
import java.util.*;
public class span {
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); // taking input for size of array 

        int [] arr= new int[n];  // here we have created an array of size n 
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();// adding element to the array 
        }
        int max= arr[0];// intiliazing max and min 
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
       
        int span = max-min;
        System.out.println(span);

      scn.close();
    }
    
}
 
