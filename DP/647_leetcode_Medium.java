class Solution {
    public boolean isPalindrome(String str,boolean[][] dp ,int g,int s,int e){
    if (g == 0) { // Single character
        dp[s][e] = true;
    } else if (g == 1) { // Two characters
        dp[s][e] = (str.charAt(s) == str.charAt(e));
    } else { // More than two characters
            if((str.charAt(s) == str.charAt(e)) && dp[s + 1][e - 1]){
                dp[s][e]=true;
            }
    } 
        // now retun it
        return dp[s][e];
    }
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        boolean[][] dp = new boolean[1001][1001];
        for(int g=0;g<n;g++){ // gap or length iteration
            for(int start=0,end=g; end<n; start++,end++){
                if(isPalindrome(s,dp,g,start,end)){
                    count++;
                }
            }
        }
        return count;
        
    }
}
