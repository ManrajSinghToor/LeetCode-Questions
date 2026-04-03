class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int count = 0;
        for(int i = 0; i <= n; i++){
            int j = 0;
            while(j < 31){
                if((i >> j) % 2 != 0) count++;
                j++;
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}