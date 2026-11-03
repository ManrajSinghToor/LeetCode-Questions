class Solution {
    static int[][] dp;
    public int minPower(int r, int c, int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        if(r == n - 1 && c == m - 1) return Math.max(1, 1 - dungeon[r][c]);
        if(r < 0 || r >= n || c < 0 || c >= m) return Integer.MAX_VALUE;
        if(dp[r][c] != -1) return dp[r][c];
        int right = minPower(r, c + 1, dungeon);
        int down = minPower(r + 1, c, dungeon);
        int prevAns = Math.min(right, down);
        int ans = Math.max(1, prevAns - dungeon[r][c]);
        dp[r][c] = ans;
        return ans; 
    }
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        dp = new int[n][m];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return minPower(0, 0, dungeon);
    }
}