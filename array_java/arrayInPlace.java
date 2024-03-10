package array;
public class reverseInPlace{
    static void swapInArray(int []arr,int a, int b){

        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp; 
    }
    static void reverseIn(int [] arr){
        int i =0;
        int j = arr.length-1;

        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        reverseIn(arr1);

        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }
}
