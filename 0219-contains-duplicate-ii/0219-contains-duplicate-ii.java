class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        int len = Math.min(k,nums.length);
        for(int i = 0; i < len; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            set.remove(nums[i - k]);
        }
        return false;
    }
}