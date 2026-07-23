class Solution {
    public boolean recur(int[][] arr, int row, int cols, int sum){
        int n = arr.length;
        int[][] moves = {
            {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
            {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
        };
        if(sum == n * n - 1) return true;

        for(int[] m : moves){
            int nr = row + m[0];
            int nc = cols + m[1];

            if(nr >= 0 && nr < n && nc >= 0 && nc < n && arr[nr][nc] == sum + 1){
                return recur(arr, nr, nc, sum + 1);
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        return recur(grid, 0, 0, 0);
    }
}