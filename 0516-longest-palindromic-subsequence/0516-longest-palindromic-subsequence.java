class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Traverse i from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Traverse j from left to right
            for (int j = i + 1; j < n; j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    dp[i][j] = 2 + dp[i + 1][j - 1];

                } else {

                    dp[i][j] = Math.max(
                        dp[i + 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }

        return dp[0][n - 1];
    }
}