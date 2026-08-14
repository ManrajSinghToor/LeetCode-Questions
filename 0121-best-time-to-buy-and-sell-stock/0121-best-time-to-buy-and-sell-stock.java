class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyDay = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < n; i++){
            buyDay = Math.min(buyDay, prices[i]);
            profit = Math.max(profit, prices[i] - buyDay);
        }
        return profit;
    }
}