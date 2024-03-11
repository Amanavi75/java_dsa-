package array;

// move all teh integers at the beginning of the array followed by all the integers. The relative order of odd and (question)

// also known as sort by parity 
public class arrangeOrder {
    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
}
static void sortEvenAndOdd(int arr[]){
    int n = arr.length;
    int left = 0;
    int right = n-1;
    while(left<right) {
        if(arr[left]%2==1 && arr[right]%2==0){
            swap(arr,left,right);
            left++;
            right--;
        }if (arr[left]%2==0) {
            left++;
        }if(arr[right]%2==1){
            right--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = {4,5,7,6,8,3,5};

        sortEvenAndOdd(arr1);

        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }

}
