class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n == 1) return cost[0];
        int[] dp = new int[3];
        dp[0] = cost[0];
        dp[1] = cost[1];
        int ans = Math.min(dp[0], dp[1]);
        for(int i = 2; i < n; i++) {
            dp[2] = cost[i] + Math.min(dp[1], dp[0]);
            ans = Math.min(dp[1], dp[2]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return ans;
    }
}