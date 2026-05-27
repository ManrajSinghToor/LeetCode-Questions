class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        int idx = 0; 
        int j = nums.length / 2;
        while(j < nums.length){
            ans[idx++] = nums[i];
            ans[idx++] = nums[j];
            i++;
            j++;
        }
        return ans;
    }
}