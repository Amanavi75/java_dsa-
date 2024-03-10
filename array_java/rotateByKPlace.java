package array;
import java.util.*;
public class rotateByKplace {
    static int[] rotateByK(int arr[], int k){

        int n = arr.length;
        k = k%n;
        int ans [] = new int[n];
        int j =0;
        for(int i =n-k;i<n;i++){
            ans[j++] = arr[i];
            
        }

        for(int i =0 ;i<n-k;i++){
            ans[j++] = arr[i];
           
        }
        return ans;
    }

    public static void main(String[] args) {
        int e[] = {1,2,3,4,5,6};
        int answer[] = rotateByK(e, 3);
        for(int i =0;i<answer.length;i++){
            System.out.print(answer[i]);
        }
    
    }
}
