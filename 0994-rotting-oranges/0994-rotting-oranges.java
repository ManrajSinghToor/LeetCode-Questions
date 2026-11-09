class Pair {
    int r;
    int c;
    int t;
    Pair(int r, int c, int t) {
        this.r = r;
        this.c = c;
        this.t = t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                }
            }
        }
        int maxTime = 0;
        while(!q.isEmpty()) {
            Pair top = q.remove();
            int r = top.r;
            int c = top.c;
            int time = top.t;
            maxTime = Math.max(maxTime, time);
            if(r > 0 && grid[r - 1][c] == 1) {
                grid[r - 1][c] = 2;
                q.add(new Pair(r - 1, c, time + 1));
            }
            if(r < n - 1 && grid[r + 1][c] == 1) {
                grid[r + 1][c] = 2;
                q.add(new Pair(r + 1, c, time + 1));
            }
            if(c > 0 && grid[r][c - 1] == 1) {
                grid[r][c - 1] = 2;
                q.add(new Pair(r, c - 1, time + 1));
            }
            if(c < m - 1 && grid[r][c + 1] == 1) {
                grid[r][c + 1] = 2;
                q.add(new Pair(r, c + 1, time + 1));
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) return -1;
            }
        }
        return maxTime;
    }
}