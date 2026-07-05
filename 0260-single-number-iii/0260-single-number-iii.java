class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }
        int newXor =  xor & -xor;
        int bucket1 = 0;
        int bucket2 = 0;
        for(int i = 0; i < nums.length; i++){
            if((newXor & nums[i]) == 0) bucket1 ^= nums[i];
            else bucket2 ^= nums[i];
        }
        int[] arr = new int[2];
        arr[0] = (bucket1 < bucket2) ? bucket1 : bucket2;
        arr[1] = (bucket1 < bucket2) ? bucket2 : bucket1;
        return arr;
    }
}