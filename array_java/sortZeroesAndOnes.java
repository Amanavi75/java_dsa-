package array;

public class sortZeroesAndOnes {
    static void sortZeroes(int arr[] ){

        int n = arr.length;
        int count = 0;

        for(int i =0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }

        //0 to count - 1 =0, count to n-1 = 1
        for(int i =0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {0,0,1,1,1,1,0,0};

        sortZeroes(arr1);

        for(int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
