package recurssion.array;

import basic.sum;

public class sumOfAll {
    static int sum(int [] arr, int idx){
        
        if(idx==arr.length){
            return  0;
        }
        
        int smallAns  = sum(arr, idx+1);

        return smallAns+arr[idx];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = sum(arr, 0);

        System.out.println(sum);
    }
}
