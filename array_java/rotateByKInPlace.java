package array;

public class rotateByKInPlace {
    static void swapInArray(int []arr,int a, int b){


        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp; 
    }
//actually we take the two pointer and swap it till j>i 
    static void reverseIn(int [] arr,int i , int j){
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }


    static void rotateByKInplace(int []arr, int k ){

        int n = arr.length;
        k = k%n ;

        reverseIn(arr,0,n-k-1);
        reverseIn(arr, n-k,n-1);
        reverseIn(arr, 0, n-1);
        

    }

    public static void main(String[] args) {
        int e[] = {1,2,3,4,5,6};
        rotateByKInplace(e, 3);
        for(int i =0;i<e.length;i++){
            System.out.print(e[i]);
        }
    }
}
