package array;

public class sortZeroesAndOnesInPlace {
    static void swap(int arr[],int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }
    static void sortZeroesAndOnesInPlace1(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right) {
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }if (arr[left]==0) {
                left++;
            }if(arr[right]==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {0,0,1,1,1,1,0,0};

        sortZeroesAndOnesInPlace1(arr1);

        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }
}
