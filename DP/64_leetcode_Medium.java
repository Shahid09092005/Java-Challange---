                                        // Bottom up Approach : T.C (n*m)^2 and S.C: n*m
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


class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length; // number of rows
        int n = grid[0].length; // number of columns
        int[] dp = new int[n]; // 1D array for storing the minimum path sums
        
        // Initialize dp array for the bottom row
        for (int j = n - 1; j >= 0; j--) {
            if (j == n - 1) {
                dp[j] = grid[m - 1][j];
            } else {
                dp[j] = grid[m - 1][j] + dp[j + 1];
            }
        }


                                                 // Bottom up Approach : T.C (n*m)^2 and S.C: n;
        class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length; // number of rows
        int n = grid[0].length; // number of columns
        int[] dp = new int[n]; // 1D array for storing the minimum path sums
        
        // Initialize dp array for the bottom row
        for (int j = n - 1; j >= 0; j--) {
            if (j == n - 1) {
                dp[j] = grid[m - 1][j];
            } else {
                dp[j] = grid[m - 1][j] + dp[j + 1];
            }
        }
        
        // Fill dp array for rows above the bottom row
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (j == n - 1) {
                    dp[j] = grid[i][j] + dp[j]; // last column
                } else {
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j + 1]);
                }
            }
        }
        
        return dp[0]; // The minimum path sum will be stored in dp[0]
    }
}
