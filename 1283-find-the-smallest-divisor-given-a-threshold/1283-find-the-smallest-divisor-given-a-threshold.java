class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int ele : nums){
            max = Math.max(ele, max);
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low <= high){
            int divisor = low + (high - low) / 2;
            int div = 0;
            for(int ele : nums){
                if(ele % divisor == 0) div += (ele / divisor);
                else div += (ele / divisor + 1);
            }
            if(div <= threshold){
                ans = divisor;
                high = divisor - 1;
            }
            else low = divisor
             + 1;
        }
        return ans;
    }
}