class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        long max = 0;
        long sum = 0;
        int duplicate = 0;
        while(i < k){
            if(!map.containsKey(nums[i])) map.put(nums[i], 0);
            map.put(nums[i], map.get(nums[i]) + 1);

            sum += nums[i];

            if(map.get(nums[i]) > 1) duplicate++;
            i++;
        }

        if(duplicate == 0) max = Math.max(max, sum);

        for(int idx = k; idx < nums.length; idx++){
            int numToAdd = nums[idx];
            int numToRemove = nums[idx - k];
            
            if(!map.containsKey(numToAdd)) map.put(numToAdd, 0);
            map.put(numToAdd, map.get(numToAdd) + 1);

            if(map.get(numToAdd) > 1) duplicate++;

            sum += numToAdd;
            if(map.get(numToRemove) > 1) duplicate--;
            map.put(numToRemove, map.get(numToRemove) - 1);

            sum -= numToRemove;

            if(duplicate == 0) max = Math.max(max, sum);
        }
        return max;
    }
}