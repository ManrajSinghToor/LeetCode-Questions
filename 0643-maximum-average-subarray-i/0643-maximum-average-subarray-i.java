class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            sum += nums[j];
            if((j - i + 1) == k){
                max = Math.max(max, sum / k);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        // for(int i = 0; i < k; i++){
        //     sum += nums[i];
        // }
        // max = Math.max(max, sum / k);

        // for(int i = k; i < nums.length; i++){
        //     sum += nums[i];

        //     if(i >= k){
        //         max = Math.max(max, sum / k);
        //         sum -= nums[i - k];
        //     }
        // }
        return max;
    }
}