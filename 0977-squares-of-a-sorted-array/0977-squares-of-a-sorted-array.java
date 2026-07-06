class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while(i <= j){
            int sqr1 = nums[i] * nums[i];
            int sqr2 = nums[j] * nums[j];
            if(sqr1 > sqr2) {
                ans[k--] = sqr1;
                i++;
            }
            else {
                ans[k--] = sqr2;
                j--;
            }
        }
        return ans;
    } 
}