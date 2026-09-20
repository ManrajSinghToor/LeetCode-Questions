class Solution {
    static int[][] dp;
    static int absSum;
    public int targetSum(int idx, int sum, int[] nums, int target) {
        if(idx == nums.length) {
            if(sum == target) return 1;
            else return 0;
        }
        if(dp[idx][sum+absSum] != -1) return dp[idx][sum+absSum]; 
        int add = targetSum(idx + 1, sum + nums[idx], nums, target);
        int sub = targetSum(idx + 1, sum - nums[idx], nums, target);
        int ans = add + sub;
        dp[idx][sum+absSum] = ans;
        return ans;
    }
    public int findTargetSumWays(int[] nums, int target) {
        for(int ele : nums) absSum += Math.abs(ele);
        dp = new int[nums.length][2 * absSum + 1];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return targetSum(0, 0, nums, target);
    }
}