class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int max = 0;
        for(int num : nums){
            sum += num;
            if(map.containsKey(sum - k)) max += map.get(sum - k);

            if(map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
            else map.put(sum, 1);
        }
        return max;
    }
}