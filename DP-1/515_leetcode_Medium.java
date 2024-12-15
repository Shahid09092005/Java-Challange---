class Solution {
    public int change(int amount, int[] coins) {
        // Since Repetation is allow so use 1-D DP
        int[] dp = new int[amount+1];
        dp[0]=1; //bcz , Nah hi kuch diya and ha hi kuch liye or by taking no coins.
        for(int coin : coins){
            for(int i=coin;i<dp.length;i++){
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
        
    }
}
