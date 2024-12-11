class Solution {
    public int isPalindrome(String str, int[][] dp,int g,int s,int e){
        if(g==0){ // only 1 char
            return dp[s][e]=1;
        }
        if(g==1){ // only for 2 char
            return dp[s][e]= str.charAt(s)==str.charAt(e)?2:1;
        // both char equal value then 2 bcz max comm. subseq is 2 else 1
        }
        if(g>1){ // for more then 2 char
            if(str.charAt(s)==str.charAt(e)){
                return dp[s][e]=2+dp[s+1][e-1];
            }else{
                return dp[s][e]=Math.max(dp[s][e-1],dp[s+1][e]);
            }
        }
        return dp[s][e];
    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[1001][1001];
        int n=s.length();
        int max=0;
        for(int g=0 ; g<n ; g++){
            for(int start=0,end=g; end<n; start++,end++){
                int temp = isPalindrome(s,dp,g,start,end);
                if(temp>max){
                    max=temp;
                }
            }
        }
        return max;
        
    }
}
