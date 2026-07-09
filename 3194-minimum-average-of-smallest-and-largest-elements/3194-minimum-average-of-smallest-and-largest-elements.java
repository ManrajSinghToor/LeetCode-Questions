class Solution {
    public double minimumAverage(int[] nums) {
        double[] ans = new double[nums.length / 2];
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            int max = nums[j];
            int min = nums[i];
            ans[i] = (double)(max + min) / 2;
            i++;
            j--;
        }
        double min = Integer.MAX_VALUE;
        for(int idx = 0; idx < ans.length; idx++){
            if(min > ans[idx]) min = ans[idx];
        }
        return min;
    }
}