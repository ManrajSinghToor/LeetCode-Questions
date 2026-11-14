class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minAns = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += nums.get(j);
                if(sum > 0 && (j - i + 1 >= l && j - i + 1 <= r)) {
                    minAns = Math.min(minAns, sum);
                }
                if(j - i + 1 >= r) break;
            }
        }
        if(minAns != Integer.MAX_VALUE) return minAns;
        else return -1;
    }
}