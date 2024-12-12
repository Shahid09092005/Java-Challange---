                                  //Note:memoization
class Solution {
    // lcs function start
    public int LCS(String s1,String s2,int[][] dp, int s1_len,int s2_len){
        // if either string get empty
        if(s1_len==0 || s2_len==0){
            return 0;
        }
        //value already computed
        if(dp[s1_len][s2_len]!=-1){
            return dp[s1_len][s2_len];
        }
        // if char. matches in both the string ,so add 1 to the result from the prev indices
        if(s1.charAt(s1_len-1)==s2.charAt(s2_len-1)){
            dp[s1_len][s2_len] = 1 + LCS(s1,s2,dp,s1_len-1,s2_len-1);
        }else{//char not matches then sub len from s1 and s2 then fetch their max
            // (s1.charAt(s1_len)!=s2.charAt(s2_len)){
            dp[s1_len][s2_len] = Math.max(LCS(s1,s2,dp,s1_len-1,s2_len),LCS(s1,s2,dp,s1_len,s2_len-1));
            }
        return dp[s1_len][s2_len];
        } // end LCS function
        
    public int longestCommonSubsequence(String text1, String text2) {
        int t1_len = text1.length();
        int t2_len = text2.length();
        //handle edge cases for empty strings
        if(t1_len==0 || t2_len==0) return 0;
        // Define DP array with 1 extra size for 1-based indexing
        int[][] dp = new int[t1_len+1][t2_len+1];
        //initiaze 2-D array with -1 value
        for(int i=0;i<=t1_len;i++){
            for(int j=0;j<=t2_len;j++){
                dp[i][j]=-1;
            }
        }
        // call the LCS funtion from the end of both string 
        return LCS(text1,text2,dp,t1_len,t2_len);        
    }
}

                          // Note:bottom up approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //Bottom up approach
        int s1_len=text1.length();
        int s2_len=text2.length();
        //if either string is empty
        if(s1_len==0||s2_len==0) return 0;
        //dp and +1 bcz in java 0-based indexing
        int[][] dp=new int[s1_len+1][s2_len+1];
        // Note:in java , default value set to 0 in array
        for(int i=1;i<=s1_len;i++){
            for(int j=1;j<=s2_len;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1_len][s2_len];

        
    }
}
