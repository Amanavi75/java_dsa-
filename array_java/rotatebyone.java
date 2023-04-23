package array;

import java.util.*;
public class rotatebyone
{ 
    static void lRotateOne(int arr[], int n)
    {
    	int temp = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		arr[i - 1] = arr[i];
    	}

    	arr[n - 1] = temp;
    }

    public static void main(String args[]) 
    { 
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int [] arr= new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
       }
       lRotateOne(arr,n);
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]);
       }
       scn.close();

    } 

}
