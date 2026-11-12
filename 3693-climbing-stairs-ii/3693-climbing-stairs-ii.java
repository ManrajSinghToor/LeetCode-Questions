class Solution {
    static int[] dp;
    public int climb(int r, int n, int[] costs) {
        if(r == n) return 0;
        if(dp[r] != -1) return dp[r];
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;
        if(r + 1 <= n){
            one = costs[r] + 1 + climb(r + 1, n, costs);
        }
        if(r + 2 <= n) {
            two = costs[r + 1] + 4 + climb(r + 2, n, costs);
        }
        if(r + 3 <= n) {
            three = costs[r + 2] + 9 + climb(r + 3, n, costs);
        }
        int ans = Math.min(one, Math.min(two, three));
        dp[r] = ans;
        return ans;
    }
    public int climbStairs(int n, int[] costs) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(0, n, costs);
    }
}