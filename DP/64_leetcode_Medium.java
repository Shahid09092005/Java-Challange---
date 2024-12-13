                                        // Bottom up Approach 
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length; // no. of rows
        int n = grid[0].length;  // no. of columns
        int[][] dp = new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
            // we fill value by filling seperated value to not mess up and not be complex
                if(i==m-1 && j==n-1){ // at the last row and last column
                    dp[i][j] = grid[i][j];
                }else if (i==m-1 && j<n-1){ // at the last row except last col & row box
                    dp[i][j] = grid[i][j]+ dp[i][j+1];
                }else if(i<m-1 && j==n-1){ // filling last col except last col and row box
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }else{ // rest all values
                     dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}
