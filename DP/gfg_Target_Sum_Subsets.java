class Solution {

    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int m = arr.length;
        int n = target;
        boolean[][] dp = new boolean[m+1][n+1] ;
        for(int i=0; i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){ 
                dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }else{
                    if(dp[i-1][j]==true){
                        dp[i][j]=true;
                    }else{
                        int val= arr[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j]=true;
                            }
                        }
                        
                    }
                }
            }
        }
        return dp[m][n];
    }
}
