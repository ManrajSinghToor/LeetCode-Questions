class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
            else {
                set.remove(nums[i]);
                xor ^= nums[i];
            }
        }
        return xor;
    }
}