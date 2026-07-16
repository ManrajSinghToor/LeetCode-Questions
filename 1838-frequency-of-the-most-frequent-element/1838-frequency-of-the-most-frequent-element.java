class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        int i = 0;
        int j = 0;
        long sum = 0;
        while(j < nums.length){
            sum += nums[j];
            while((long) nums[j] * (j - i + 1) - sum > k){
                sum -= nums[i];
                i++;
            }
            max = Math.max(max, (j - i + 1));
            j++;
            
        }
        return max;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         int total = nums[j] * (j - i + 1);
        //         int x = total - sum;
        //         if(x > k) break;
        //         max = Math.max(max, (j - i + 1));
        //     }
        // }
    }
}