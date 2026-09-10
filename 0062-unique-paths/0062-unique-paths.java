class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) return 1;
        int[][] dp = new int[2][n];
        dp[0][0] = 1;
        dp[1][0] = 1;
        for(int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }
        for(int i = 0; i < m - 1; i++){
            for(int j = 1; j < n; j++) {
                dp[1][j] = dp[1][j - 1] + dp[0][j];
            }

            for(int idx = 1; idx < n; idx++) {
                dp[0][idx] = dp[1][idx];
            }
        }
        return dp[1][n - 1];
    }
}