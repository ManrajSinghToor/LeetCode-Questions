class Solution {
    public boolean recurs(int row, int col, int sum, int[][] grid) {
        int n = grid.length;
        if(grid[0][0] != 0) return false;
        int[][] moves = {
            {2, -1}, {2, 1}, {1, 2}, {-1, 2},
            {-2, -1}, {-2, 1}, {-1, -2}, {1, -2}
        };
        if(sum == n * n - 1) return true;
        for(int[] move : moves) {
            int r = row + move[0];
            int c = col + move[1];

            if(r >= 0 && r < n && c >= 0 && c < n && grid[r][c] == sum + 1) {
                return recurs(r, c, sum + 1, grid);
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        return recurs(0, 0, 0, grid);
    }
}