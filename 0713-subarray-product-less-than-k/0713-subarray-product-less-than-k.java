class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0) return 0;
        int cnt = 0;
        int i = 0;
        int j = 0;
        int prod = 1;
        while(j < nums.length){
            prod *= nums[j];
            while(prod >= k){
                prod /= nums[i];
                i++;
            }
            cnt += (j - i + 1);
            j++;
        }
        return cnt;
    }
}