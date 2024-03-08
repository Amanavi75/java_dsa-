package array;

public class uniqueNumber {
    static int uniqueNum(int [] arr){

        int n = arr.length;
        int unique = 0;

        //* whenever there are two similar elements we will make it as -1  */

        for(int i =0;i<n;i++){
           for(int j =i+1;j<n;j++){
            if(arr[i]==arr[j]){

                arr[i] = -1;
                arr[j] = -1;
            }
         }

        }

        for(int i =0;i<n;i++){
            if(arr[i]>0){
                unique= arr[i];
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        int arr [] = {1,1,2,3,2,3,4};
        int uni = uniqueNum(arr);

        System.out.println(uni);
    }
}
