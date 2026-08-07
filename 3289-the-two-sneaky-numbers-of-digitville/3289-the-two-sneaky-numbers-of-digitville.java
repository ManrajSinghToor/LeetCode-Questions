class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) ans[k++] = nums[i];
            set.add(nums[i]);
        } 
        return ans;
    }
}