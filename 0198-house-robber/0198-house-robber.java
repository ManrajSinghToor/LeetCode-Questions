class Solution {
    static int[] dp;
    public int thief(int idx, int[] arr) {
        if(idx >= arr.length) return 0;
        if(dp[idx] != -1) return dp[idx];

        int pick = arr[idx] + thief(idx + 2, arr);
        int skip = thief(idx + 1, arr);

        int ans = Math.max(pick, skip);
        dp[idx] = ans;
        
        return ans;
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return thief(0, nums);
    }
}