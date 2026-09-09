class Solution {
    public int chorBc(int st, int end, int[] dp, int[] nums) {
        if(st == end ) return nums[st];
        dp[st] = nums[st];
        dp[st + 1] = Math.max(nums[st], nums[st + 1]);
        for(int i = st + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[end];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] dp = new int[n];
        int ans1 = chorBc(0, n - 2, dp, nums);
        int ans2 = chorBc(1, n - 1, dp, nums);

        return Math.max(ans1, ans2);
    }
}