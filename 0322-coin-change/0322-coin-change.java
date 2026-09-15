class Solution {
    static int[][] dp;
    public int coin(int idx, int[] coins, int amount) {
        if(idx == coins.length) {
            if(amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int pick = 0;
        if(coins[idx] <= amount) {
            int help = coin(idx, coins, amount - coins[idx]);
            if(help != Integer.MAX_VALUE) pick = 1 + help;
            else pick = help;
        }
        int skip = coin(idx + 1, coins, amount);
        if(coins[idx] > amount) return skip;
        int ans = Math.min(pick, skip);
        dp[idx][amount] = ans;
        return ans;
    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        int ans = coin(0, coins, amount);
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
}