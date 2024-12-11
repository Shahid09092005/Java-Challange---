class Solution {
    public boolean isPalindrome(String str, boolean[][] dp, int g, int s, int e) {
        if (g == 0) return dp[s][e] = true; // Single character
        if (g == 1) dp[s][e] = (str.charAt(s) == str.charAt(e)); // Two characters
        if (g > 1) { // More than two characters
            dp[s][e] = (str.charAt(s) == str.charAt(e)) && dp[s + 1][e - 1];
        }
        return dp[s][e];
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return ""; // Handle empty string

        // Initialize DP table
        boolean[][] dp = new boolean[n][n];

        // Variables to track the start and end indices of the longest palindrome
        int st_idx = 0;
        int end_idx = 0;
        int max = 0;

        // Iterate over all possible lengths (gaps)
        for (int g = 0; g < n; g++) {
            for (int start = 0, end = g; end < n; start++, end++) {
                if (isPalindrome(s, dp, g, start, end)) {
                    if (g + 1 > max) { // Update max length and indices
                        st_idx = start;
                        end_idx = end;
                        max = g + 1;
                    }
                }
            }
        }

        // Return the longest palindrome substring
        return s.substring(st_idx, end_idx + 1);
    }
}
