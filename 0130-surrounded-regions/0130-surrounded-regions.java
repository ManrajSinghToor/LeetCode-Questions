class Pair {
    int r;
    int c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public void solve(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if((i == 0 || j == 0 || i == n - 1 || j == m - 1)
                && grid[i][j] == 'O'){
                    grid[i][j] = 'L';
                    q.add(new Pair(i, j));
                }
            }
        }
        while(!q.isEmpty()) {
            Pair top = q.remove();
            int r = top.r;
            int c = top.c;
            if(r > 0 && grid[r - 1][c] == 'O') {
                grid[r - 1][c] = 'L';
                q.add(new Pair(r - 1, c));
            }
            if(r < n - 1 && grid[r + 1][c] == 'O') {
                grid[r + 1][c] = 'L';
                q.add(new Pair(r + 1, c));
            }
            if(c > 0 && grid[r][c - 1] == 'O') {
                grid[r][c - 1] = 'L';
                q.add(new Pair(r, c - 1));
            }
            if(c < m - 1 && grid[r][c + 1] == 'O') {
                grid[r][c + 1] = 'L';
                q.add(new Pair(r, c + 1));
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 'L') grid[i][j] = 'O';
                else grid[i][j] = 'X';
            }
        }
    }
}