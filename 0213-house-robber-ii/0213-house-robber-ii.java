class Solution {
    static int[] dp;
    public int chor(int idx, int n, int[] nums) {
        if(idx >= n) return 0;
        if(dp[idx] != -1) return dp[idx];
        int pick = nums[idx] + chor(idx + 2, n, nums);
        int skip = chor(idx + 1, n, nums);
        int ans = Math.max(pick, skip);
        dp[idx] = ans;
        return ans;
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans1 = chor(0, nums.length - 1, nums);
        Arrays.fill(dp, -1);
        int ans2 = chor(1, nums.length, nums);
        return Math.max(ans1, ans2);
    }
}