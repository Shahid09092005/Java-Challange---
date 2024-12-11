class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        int i=0;
        int j=s.length()-1;
        while(i<j){
        // at initial we should not convert into lowercase bcz it will skip non-alphanumeric
            
            // check next char of i is not non-aplhanumeric
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++; // i is not alphanumeric
            }

            // check next char of j is not non-aplhanumeric
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;  // j is not alphanumeric
            }

            // now convert into lowercase bcz not they reach to aplhanumberic char
            char i_char = Character.toLowerCase(s.charAt(i));
            char j_char = Character.toLowerCase(s.charAt(j));
            if(i_char!=j_char) return false; // not a Palindrome
            //above cases satisfy so increase i and decrease j
            i++;
            j--;
        }
        return true; // palindrome
        
    }
}
