class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + nums[i];
        }

        int i = 0;
        int j = 0;
        while(j < n){
            if(prefix[i] == suffix[j]) return i;
            i++;
            j++;
        }
        return -1;
    }
}