class Solution {
    static int[][] dp;
    public int minPath(int lr, int lc, int[][] grid) {
        if(lr == 0 && lc == 0) return grid[0][0];
        if(lr < 0 || lc < 0) return Integer.MAX_VALUE;
        if(dp[lr][lc] != -1) return dp[lr][lc];
        int down = minPath(lr - 1, lc, grid);
        if(down != Integer.MAX_VALUE) down += grid[lr][lc];
        int right = minPath(lr, lc - 1, grid);
        if(right != Integer.MAX_VALUE) right += grid[lr][lc];
        int ans = Math.min(down, right);
        dp[lr][lc] = ans;
        return ans;
    } 
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n][m];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return minPath(n - 1, m - 1, grid);
    }
}