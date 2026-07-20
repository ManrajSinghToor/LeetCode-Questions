class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) totalSum += nums[i];

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            int add = nums[i];

            nums[i] = Math.abs(rightSum - leftSum);
            leftSum += add;
        }
        return nums;
    }
}