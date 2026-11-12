class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;

        int inc = 1, maxInc = 0;
        int dec = 1, maxDec = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i - 1]) inc++;
            else inc = 1;

            if(nums[i] > nums[i - 1]) dec++;
            else dec = 1;

            maxInc = Math.max(inc, maxInc);
            maxDec = Math.max(dec, maxDec);
        }
        return Math.max(maxInc, maxDec);
    }
}