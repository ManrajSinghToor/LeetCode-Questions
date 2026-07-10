class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int isDup = 0;

        for(int i = 0; i < k; i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);

            sum += nums[i];

            if(map.get(nums[i]) > 1) isDup++;
        }
        if(isDup == 0) max = Math.max(sum, max);

        for(int i = k; i < nums.length; i++){
            int numToAdd = nums[i];
            int numToRemove = nums[i - k];
            if(map.containsKey(numToAdd)) map.put(numToAdd, map.get(numToAdd) + 1);
            else map.put(numToAdd, 1);

            sum += numToAdd;
            if(map.get(numToAdd) > 1) isDup++;

            if(map.get(numToRemove) > 1) isDup--;
            map.put(numToRemove, map.get(numToRemove) - 1);

            sum -= numToRemove;
            if(isDup == 0) max = Math.max(sum, max);
        }
        return max;
    }
}