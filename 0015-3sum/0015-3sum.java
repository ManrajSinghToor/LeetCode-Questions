class Solution {
    public void twoSum(int idx, List<List<Integer>> ans, int[] nums){
        int i = idx + 1;
        int j = nums.length - 1;
        while(i < j){
            int sum = nums[idx] + nums[i] + nums[j];
            if(sum > 0) j--;
            else if(sum < 0) i++;
            else {
                ans.add(Arrays.asList(nums[idx], nums[i], nums[j]));
                i++;
                j--;
                while(i < j && nums[i] == nums[i - 1]) i++;
                while(i < j && nums[j] == nums[j + 1]) j--;
            }
        }

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i == 0 || nums[i] != nums[i - 1]) twoSum(i, ans, nums);
        }
        return ans;
    }
}