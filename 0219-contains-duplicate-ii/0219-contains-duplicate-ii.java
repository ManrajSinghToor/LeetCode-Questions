class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i < n; i++){
        //     if(set.contains(nums[i])) return true;
        //     set.add(nums[i]);
        //     if(set.size() > k) set.remove(nums[i - k]);
        // }
        // return false;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int j = 0; j < n; j++){
            if(map.containsKey(nums[j])){
                if((j - map.get(nums[j])) <= k) return true;
                map.put(nums[j], j);
            }
            else {
                map.put(nums[j], j);
            }
        }
        return false;
    }
}