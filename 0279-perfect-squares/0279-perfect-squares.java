class Solution {
    static int[][] dp;
    public int sqr(int idx, int sum, int n) {
        if(sum == n) return 0;
        if(sum > n || idx * idx > n) return Integer.MAX_VALUE;
        if(dp[idx][sum] != -1) return dp[idx][sum];
        int pick = Integer.MAX_VALUE;
        int sqrNum = idx * idx;
        if(sum + sqrNum <= n)        {
            pick = sqr(idx, sum + sqrNum, n);
            if(pick != Integer.MAX_VALUE) pick += 1;
        }
        int skip = sqr(idx + 1, sum, n);
        int ans = Math.min(skip, pick);
        dp[idx][sum] = ans;
        return ans;
    }
    public int numSquares(int n) {
        int max = (int)Math.sqrt(n);
        dp = new int[max + 1][n + 1];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        if(n <= 3) return n;
        int ans = sqr(1, 0, n);
        return ans;
    }
}