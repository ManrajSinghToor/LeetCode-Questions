class Solution {
    public int[] buildLps(int[] pattern, int n){
        int[] lps = new int[n];
        int i = 1;
        int len = 0;
        while(i < n){
            if(pattern[i] == pattern[len]) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {
                if(len > 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int[] lps = buildLps(pattern, m);

        int i = 0; 
        int j = 0;
        int cnt = 0;
        while(i < n - 1){
            int curr;
            if(nums[i + 1] > nums[i]) curr = 1;
            else if(nums[i + 1] == nums[i]) curr = 0;
            else curr = -1;

            if(curr == pattern[j]){
                i++;
                j++;
                if(j == m) {
                    cnt++;
                    j = lps[j - 1];
                }
            }
            else {
                if(j > 0) j = lps[j - 1];
                else i++;
            }
        }
        return cnt;
    }
}