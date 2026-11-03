class Solution {
    public int sqr(int n, int[] dp) {
        if (n == 0) return 0;
        if (dp[n] != -1) return dp[n];
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int recur = sqr(n - i * i, dp);
            ans = Math.min(ans, 1 + recur);
        }
        dp[n] = ans;
        return ans;
    }
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return sqr(n, dp);
    }
}