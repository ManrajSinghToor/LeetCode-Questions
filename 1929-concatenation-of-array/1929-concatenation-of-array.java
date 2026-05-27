class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int idx = 0;
        while(idx < nums.length){
            ans[idx] = nums[idx];
            idx++; 
        }
        int i = 0;
        while(i < nums.length){
            ans[idx] = nums[i];
            idx++;
            i++; 
        }
        return ans;
    }
}