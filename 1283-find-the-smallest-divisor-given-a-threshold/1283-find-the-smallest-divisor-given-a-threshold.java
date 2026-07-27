class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
        }
        int i = 1;
        int j = max;
        int ans = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            int divisor = 0;
            for(int idx = 0; idx < nums.length; idx++){
                if(nums[idx] % mid == 0) divisor += (nums[idx] / mid);
                else divisor += (nums[idx]/mid + 1);
            }
            if(divisor <= threshold) {
                ans = mid;
                j = mid - 1;
            }
            else i = mid + 1;
        }
        return ans;
    }
}