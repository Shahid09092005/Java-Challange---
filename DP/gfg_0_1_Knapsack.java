class Solution {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        // 2-D array:- bcz duplication is not allow
        int[][] dp = new int[val.length+1][capacity+1]; //
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }else if(i==0){
                    dp[i][j]=0;
                }else if(j==0){
                    dp[i][j]=0;
                }else{
                    if(wt[i-1]<=j){ // able to store
                        dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]) ;//Exclude, Include
                    }else{ // curr cap is less than weight as j<wt[i-1]
                        dp[i][j]=dp[i-1][j] ;// chose upper value                        
                    }
                }
            }
        }
        return dp[val.length][capacity];
    }
}
