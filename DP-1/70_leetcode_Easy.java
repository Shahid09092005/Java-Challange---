                                            //Memoization Methods
class Solution {
    public int climb(int n,int[] dp){
        // Base case: reach to reach to 0 stairs then return 1 way
        if(n==0) return 1;
        if(n<0) return 0; // less than 0 staris reach then return 0
        //compute before
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return climb(n,dp);
        
    }
}

                                            //Bottom-up approach
class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0; // reach to 0 
        if(n==1) return 1;
        if(n==2) return 2;
        int a=1;// 1 stair left so no. of way to reach 0 is 1
        int b=2; // 2 stair left so no. of way to reach 0 is 2
        int c=0; 
        while(n>=3){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return c;
        
    }
}
