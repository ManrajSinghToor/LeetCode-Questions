class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public void bfs(int r, int c, char[][] grid, boolean[][] visit) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        visit[r][c] = true;
        while(!q.isEmpty()) {
            Pair top = q.remove();
            int row = top.row;
            int col = top.col;
            if(row > 0 && grid[row - 1][col] == '1' && visit[row - 1][col] == false) {
                q.add(new Pair(row - 1, col));
                visit[row - 1][col] = true;
            }
            if(row < n - 1 && grid[row + 1][col] == '1' && visit[row + 1][col] == false) {
                q.add(new Pair(row + 1, col));
                visit[row + 1][col] = true;
            }
            if(col > 0 && grid[row][col - 1] == '1' && visit[row][col - 1] == false) {
                q.add(new Pair(row, col - 1));
                visit[row][col - 1] = true;
            }
            if(col < m - 1 && grid[row][col + 1] == '1' && visit[row][col + 1] == false) {
                q.add(new Pair(row, col + 1));
                visit[row][col + 1] = true;
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == '1' && !visit[i][j]) {
                    bfs(i, j, grid, visit);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}