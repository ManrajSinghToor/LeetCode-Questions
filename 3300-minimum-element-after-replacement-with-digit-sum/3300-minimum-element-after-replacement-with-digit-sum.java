class Solution {
    public int sumDigits(int n){
        if(n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = sumDigits(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]) min = nums[i];
        }
        return min;
    }
}