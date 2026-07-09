class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0; 
        int cnt = 0;
        int max = 0;
        while(i < nums.length){
            if(nums[i] == 0) cnt = 0;
            else cnt++;
            i++;
            max = Math.max(cnt, max);
        }
        return max;
    }
}