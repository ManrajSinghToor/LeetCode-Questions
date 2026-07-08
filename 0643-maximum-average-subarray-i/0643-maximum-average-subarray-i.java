class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        max = Math.max(max, sum);
        int j = k;
        while(j < n){
            sum += nums[j] - nums[j - k];
            max = Math.max(max,sum);
            j++;
        }
        return (double)max / k;
    }
}