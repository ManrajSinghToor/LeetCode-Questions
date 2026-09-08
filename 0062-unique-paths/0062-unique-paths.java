class Solution {
    static int[][] dp;
    public int uniPath(int st1, int st2, int end1, int end2){
        if(st1 == end1 && st2 == end2) return 1;
        if(st1 < 0 || st1 > end1 || st2 < 0 || st2 > end2) return 0;
        if(dp[st1][st2] != -1) return dp[st1][st2];
        int down = uniPath(st1 + 1, st2, end1, end2);
        int right = uniPath(st1, st2 + 1, end1, end2);
        int ans = down + right;
        dp[st1][st2] = ans;
        return ans;
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return uniPath(0, 0, m - 1, n - 1);
    }
}