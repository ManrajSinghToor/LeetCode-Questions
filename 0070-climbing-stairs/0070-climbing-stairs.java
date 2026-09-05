class Solution {
    static int[] dp;
    public int climb(int n) {
        if(n <= 3) return n;
        if(dp[n] != -1) return dp[n];
        int ans = climb(n - 1) + climb(n - 2);
        dp[n] = ans;
        return ans;
    }
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(n);
    }
}