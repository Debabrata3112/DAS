class Solution {
    public int longestPalindromeSubseq(String s) {
        int i = 0;
        int j = s.length() - 1;
        int[][] dp = new int[s.length()][s.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(s, i, j, dp);
    }
    private int solve(String s, int i, int j, int[][] dp) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = 2 + solve(s, i + 1, j - 1, dp);
            return dp[i][j];
        }
        int left = solve(s, i + 1, j, dp);
        int right = solve(s, i, j - 1, dp);

        return dp[i][j] = Math.max(left, right);
    }
}