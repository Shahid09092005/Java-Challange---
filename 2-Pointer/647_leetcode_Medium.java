class Solution {
  // Note : dy using DP its can solve in linear time 
      // Check out solution by dp folder
    public boolean isPalindrome(String s ,int i , int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
      // Note : dy using DP its can solve in linear time 
      // Check out solution by dp folder
        int n=s.length()-1;
        int count =0;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(isPalindrome(s,i,j)) count++;
            }
        }
        return count;
    }
}
