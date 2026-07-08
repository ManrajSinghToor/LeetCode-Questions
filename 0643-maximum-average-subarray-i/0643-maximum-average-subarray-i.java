class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= n - k; i++){
            int sum = 0;
            int j = i;
            while(j < k + i){
                sum += nums[j];
                j++;
            }
            max = Math.max(sum, max);
        }
        return (double)max / k;
    }
}