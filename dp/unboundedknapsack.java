package dp;

public class unboundedknapsack {
    public static int unboundedknapsac(int val[],int wt[],int w ){
        int n = val.length;
        int dp [][]= new int [n+1][w+1];
        for (int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<w+1;j++){
            dp[0][j]=0; 
        }
        for(int i=1;i<n+1;i++){
            for(int j =1;j<w+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
    public static void main (String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w = 7;
        System.out.println(unboundedknapsac(val, wt, w));
    }

}
