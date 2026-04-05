class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCnt = 0, maxCnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) currCnt++;
            else {
                maxCnt = Math.max(currCnt, maxCnt);
                currCnt = 0;
            }
        }
        return Math.max(maxCnt, currCnt);
    }
}