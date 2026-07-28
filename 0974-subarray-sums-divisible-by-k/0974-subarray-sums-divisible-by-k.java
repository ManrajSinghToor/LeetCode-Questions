class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, max = 0;
        for (int num : nums) {
            sum += num;
            int rem = sum % k;
            if (rem < 0) rem += k;
            // if (map.containsKey(rem)) max += map.get(rem);

            if(map.containsKey(rem)) {
                max += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            }
            else map.put(rem, 1);
        }

        return max;
    }
}