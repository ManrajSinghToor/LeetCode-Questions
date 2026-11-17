class Solution {
    static int[][] dp;
    public int buySell(int idx, int canBuy, int[] prices) {
        if(idx == prices.length) return 0;
        if(dp[idx][canBuy] != -1) return dp[idx][canBuy];

        long profit = 0;
        if(canBuy == 1) {
            int pick = -prices[idx] + buySell(idx + 1, 0, prices);
            int skip =  buySell(idx + 1, 1, prices);
            profit = Math.max(pick, skip);
        }
        else {
            int pick = prices[idx] + buySell(idx + 1, 1, prices);
            int skip = buySell(idx + 1, 0, prices);
            profit = Math.max(pick, skip);
        }
        return dp[idx][canBuy] = (int) profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][2];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return buySell(0, 1, prices);
    }
}