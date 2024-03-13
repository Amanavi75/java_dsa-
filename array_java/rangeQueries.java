package array;

public class rangeQueries {
    static int[] makePrefix(int[]arr){
        for(int i = 1; i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        
    }
}
