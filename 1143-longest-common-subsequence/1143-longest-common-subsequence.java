class Solution {
    static int[][] dp;
    public int lcs(int i, int j, String text1, String text2) {
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(text1.charAt(i) == text2.charAt(j)) {
            ans = 1 + lcs(i - 1, j - 1, text1, text2);
        }
        else {
            int pick = lcs(i - 1, j, text1, text2);
            int skip = lcs(i, j - 1, text1, text2);
            ans = Math.max(pick, skip);
        }
        dp[i][j] = ans;
        return ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        dp = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return lcs(n - 1, m - 1, text1, text2);
    }
}