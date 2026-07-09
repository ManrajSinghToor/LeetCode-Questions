class Solution {
    public double minimumAverage(int[] nums) {
        // double[] ans = new double[nums.length / 2];
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        double minAns = Integer.MAX_VALUE;
        while(i < j){
            int max = nums[j];
            int min = nums[i];
            double ans = (double)(max + min) / 2;
            i++;
            j--;
            if(minAns > ans) minAns = ans;
        }
        return minAns;
    }
}