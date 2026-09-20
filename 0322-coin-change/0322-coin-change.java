class Solution {
    static int[][] dp;
    public int coins(int idx, int[] coins, int amt) {
        if(idx == coins.length) {
            if(amt == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][amt] != -1) return dp[idx][amt];
        int pick = 0;
        if(amt >= coins[idx]) {
            int recurs = coins(idx, coins, amt - coins[idx]);
            if(recurs != Integer.MAX_VALUE) pick = 1 + recurs;
            else pick = recurs;
        }
        int skip = coins(idx + 1, coins, amt);
        if(amt < coins[idx]) return skip;
        int ans = Math.min(pick, skip);
        dp[idx][amt] = ans;
        return ans;

    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        int ans = coins(0, coins, amount);
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
}