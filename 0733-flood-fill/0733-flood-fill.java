class Pair {
    int r;
    int c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        if(image[sr][sc] == color) return image;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        int currColor = image[sr][sc];
        image[sr][sc] = color;
        while(!q.isEmpty()) {
            Pair top = q.remove();
            int r = top.r;
            int c = top.c;
            if(r > 0 && image[r - 1][c] == currColor) {
                q.add(new Pair(r - 1, c));
                image[r - 1][c] = color;
            }
            if(r < n - 1 && image[r + 1][c] == currColor) {
                q.add(new Pair(r + 1, c));
                image[r + 1][c] = color;
            }
            if(c > 0 && image[r][c - 1] == currColor) {
                q.add(new Pair(r, c - 1));
                image[r][c - 1] = color;
            }
            if(c < m - 1 && image[r][c + 1] == currColor) {
                q.add(new Pair(r, c + 1));
                image[r][c + 1] = color;
            }
        }
        return image;
    }
}