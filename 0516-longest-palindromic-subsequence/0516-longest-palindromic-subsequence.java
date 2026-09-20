class Solution {
    int[][] dp;
    public int lcs(int i, int j, StringBuilder s1, StringBuilder s2) {
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)) ans = 1 + lcs(i - 1, j - 1, s1, s2);
        else {
            int pick = lcs(i - 1, j, s1, s2);
            int skip = lcs(i, j - 1, s1, s2);
            ans = Math.max(pick, skip);
        }
        dp[i][j] = ans;
        return ans;
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        dp = new int[n][n];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return lcs(n - 1, n - 1, new StringBuilder(s), sb);
    }
}