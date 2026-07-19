class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        while(i <= j){
            if(nums[i] < pivot) ans[k++] = nums[i];
            i++;
        }
        i = 0;
        j = nums.length - 1;
        while(i <= j){
            if(nums[i] == pivot) ans[k++] = nums[i];
            i++;
        }
        i = 0;
        j = nums.length - 1;
        while(i <= j){
            if(nums[i] > pivot) ans[k++] = nums[i];
            i++;
        }
        return ans;
    }
}