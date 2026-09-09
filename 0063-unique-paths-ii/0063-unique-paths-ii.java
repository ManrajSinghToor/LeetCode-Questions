class Solution {
    static int[][] dp;
    public int uniPath(int r, int c, int lr, int lc, int[][] arr) {
        if(r == lr && c == lc) return 1;
        if(r > lr || c > lc || arr[r][c] == 1) return 0;
        if(dp[r][c] != -1) return dp[r][c];
        int down = uniPath(r + 1, c, lr, lc, arr);
        int right = uniPath(r, c + 1, lr, lc, arr);
        int ans = down + right;
        dp[r][c] = ans;
        return ans;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[n - 1][m - 1] == 1) return 0;
        dp = new int[n][m];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return uniPath(0, 0, n - 1, m - 1, obstacleGrid);
    }
}