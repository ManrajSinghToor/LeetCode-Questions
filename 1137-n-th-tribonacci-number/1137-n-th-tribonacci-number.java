class Solution {
    static int[] dp;
    public int treo(int n) {
        if(n <= 1) return n;
        if(n == 2) return 1;
        if(dp[n] != -1) return dp[n];
        int ans = treo(n - 1) + treo(n - 2) + treo(n - 3);
        dp[n] = ans;
        return ans;
    }
    public int tribonacci(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return treo(n);
    }
}