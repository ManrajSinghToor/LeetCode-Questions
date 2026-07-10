class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCnt = 0;
        int max = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0) zeroCnt++;
            while(zeroCnt > k){
                if(nums[left] == 0) zeroCnt--;
                left++;
            }
            max = Math.max(max, (right - left + 1));
        }
        return max;
    }
}