class Pair {
    int r;
    int c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int bfs(int row, int col, int[][] grid, boolean[][] visit) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        visit[row][col] = true;
        int area = 1;
        while(!q.isEmpty()) {
            Pair top = q.remove();
            int r = top.r;
            int c = top.c;
            if(r > 0 && grid[r - 1][c] == 1 && !visit[r - 1][c]) {
                area += 1;
                q.add(new Pair(r - 1, c));
                visit[r - 1][c] = true;
            }
            if(r < n - 1 && grid[r + 1][c] == 1 && !visit[r + 1][c]) {
                area += 1;
                q.add(new Pair(r + 1, c));
                visit[r + 1][c] = true;
            }
            if(c > 0 && grid[r][c - 1] == 1 && !visit[r][c - 1]) {
                area += 1;
                q.add(new Pair(r, c - 1));
                visit[r][c - 1] = true; 
            }
            if(c < m - 1 && grid[r][c + 1] == 1 && !visit[r][c + 1]) {
                area += 1;
                q.add(new Pair(r, c + 1));
                visit[r][c + 1] = true;
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];
        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1 && !visit[i][j]) {
                    int area = bfs(i, j, grid, visit);
                    maxArea = Math.max(area, maxArea);
                }
            }
        } 
        return maxArea;
    }
}