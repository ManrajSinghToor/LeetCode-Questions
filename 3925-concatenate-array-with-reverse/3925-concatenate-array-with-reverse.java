class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            ans[k++] = nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            ans[k++] = nums[i];
        }
        return ans;
    }
}