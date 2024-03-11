package array;
//given a integer array a sorted in non decreasing order , return an array of the squares of each number sorted in non decreasing order.
public class sortedSquare {
    static int[] sortSqr(int arr []){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans [] = new int[n];
        int k =0;
        while(left<=right){

            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else { 
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int arr1[] = {4,-6,5,-8,2,3};
       int answer[] = sortSqr(arr1);

       for(int i =0;i<answer.length;i++){
        System.out.println(answer[i]);
       }
    }
}
