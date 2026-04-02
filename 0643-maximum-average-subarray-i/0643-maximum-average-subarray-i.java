class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        double sum = 0, max = Integer.MIN_VALUE;

        if(n == 1) return nums[0];
        while(j < n){
            sum += nums[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(sum > max){
                    max = sum;
                }
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max/k;
    }
}