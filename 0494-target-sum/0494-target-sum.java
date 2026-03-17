class Solution {
    int count = 0;
    public void recurs(int[] nums, int idx, int sum, int target){
        if(idx == nums.length){
            if(sum == target){
                count++;
            }
            return;
        }
        recurs(nums, idx + 1, sum + nums[idx], target);

        recurs(nums, idx + 1, sum - nums[idx], target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        recurs(nums, 0, 0, target);
        return count;
    }
}