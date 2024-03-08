tpackage array;

public class targetSum {
    static int  target(int[] arr , int target ){
        int n = arr.length;

        int countPairs =0;
        for(int i =0;i<n;i++){ 
            //*first loop to fix the first number and another loop to to addup the another one */
            for (int j =i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    countPairs++;
                }
            }
        }

        return countPairs;
    }
    public static void main(String[] args) {
        int ar[] = {4,6,3,5,8,2};
        int tar = 7;

        int noOfPairs = target(ar, tar);

        System.out.println(noOfPairs);
    }
}
