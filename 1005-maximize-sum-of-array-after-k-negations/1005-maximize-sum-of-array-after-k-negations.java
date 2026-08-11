class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length && k > 0){
            if(nums[i] < 0){
                nums[i] = -nums[i];
                k--;
            }
            i++;
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int idx : nums){
            sum += idx;
            min = Math.min(min, idx);
        }
        return k % 2 == 0? sum : sum - 2 * min;

    }
}