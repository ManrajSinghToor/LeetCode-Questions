class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 1; i < nums.length; i += 2){
            int last = nums[i - 1];
            int curr = nums[i];
            sum += Math.min(last, curr);
        }
        return sum;
    }
}