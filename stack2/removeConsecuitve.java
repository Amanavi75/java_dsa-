package stack2;
import java.util.Stack;

public class removeConsecuitve {
    public static int[] remove(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            } else if (arr[i] == st.peek()){
                if(i == n-1 || arr[i]!= arr[i+1]){
                    st.pop();
                }
            }
        }
        
        int res[] = new int[st.size()];
        for(int j = res.length-1; j >= 0; j--){
            res[j] = st.pop();
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int result[] = remove(arr);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
