class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MAX_VALUE;
        while(j < nums.length){
            sum += nums[j];
            while(sum >= target){
                max = Math.min((j - i + 1), max);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        max = (max == Integer.MAX_VALUE)? 0 : max;
        return max;
    }
}