class Solution {
    static int[] dp;
    public int climb(int idx, int[] cost) {
        if(idx >= cost.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int ans = cost[idx] + Math.min(climb(idx + 1, cost), climb(idx + 2, cost));
        dp[idx] = ans;
        return ans;
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(climb(0, cost), climb(1, cost));
    }
}