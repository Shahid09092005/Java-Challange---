                      // Memoization
class Solution {
    public int solve(int[] cost,int idx,int[] dp){
        if(idx>=cost.length) return 0 ;// reach to top of stair
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int one_step= cost[idx]+solve(cost,idx+1,dp);
        int two_step = cost[idx]+solve(cost,idx+2,dp);
        return dp[idx] = Math.min(one_step,two_step);
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return Math.min(solve(cost,0,dp),solve(cost,1,dp));
    }
}

                                                      // Bottom-up Approach
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // Create a dp array to store the minimum cost to reach each step
        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 0; // Cost to start from the "ground" before the first step
        dp[1] = 0; // Cost to start from the first step
        
        // Fill dp array from step 2 onwards
        for (int i = 2; i <= n; i++) {
            // Minimum cost to reach the current step
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        
        // The result is the minimum cost to reach the top
        return dp[n];
    }
}
