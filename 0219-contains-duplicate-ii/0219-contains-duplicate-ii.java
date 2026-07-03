class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                if((i - map.get(nums[i])) <= k) return true;
                map.put(nums[i], i);
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}