package recurssion.array;

public class maxArray {
    static int  max(int arr[] , int idx){
        int n = arr.length;
        if(idx==n-1){
            return arr[idx];

        }

        int smallAns = max(arr, idx+1);

    
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8,9};
        System.out.println(max(arr, 0));
    }
}
