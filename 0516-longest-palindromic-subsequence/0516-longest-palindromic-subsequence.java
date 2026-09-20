class Solution {
    static int[][] dp;
    public int lps(int i, int j, StringBuilder sb) {
        if(i == j) return 1;
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(sb.charAt(i) == sb.charAt(j)) ans = 2 + lps(i + 1, j - 1, sb);
        else {
            int pick = lps(i + 1, j, sb);
            int skip = lps(i, j - 1, sb);
            ans = Math.max(pick, skip);
        }
        dp[i][j] = ans;
        return ans;
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        dp = new int[n][n];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return lps(0, n - 1, new StringBuilder(s));
    }
}