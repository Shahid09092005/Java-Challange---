                                                    // Memoization(top-down approach)
class Solution { 
    public int funct(int n,int[] dp){
        if(n==0 || n==1){ //Base case
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        // Calculate and store the value in the dp array
        dp[n] = funct(n - 1, dp) + funct(n - 2, dp);
        return dp[n];
    }
    public int fib(int n) {
         // Initialize the dp array with -1
        int[] dp = new int[30+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
         // Base values
        dp[0]=0;
        dp[1]=1;
        return funct(n,dp);

    }
}

                                                    // Bottom up Approach
class Solution {
    public int fib(int n) {
        if(n==1 || n==0) return n;
        int a=0;    //first
        int b=1;    //Second
        int c=0;
        while(n-2>=0){ //bcz first 2 already calculated
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    return c;
    }
}
