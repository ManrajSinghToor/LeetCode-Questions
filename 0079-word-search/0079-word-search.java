class Solution {
    static int n;
    static int m;
    public boolean backTrack(int idx, int row, int col, boolean[][] visit, char[][] board, String word) {
        if(idx == word.length()) return true;
        if(row < 0 || col < 0 || row >= n || col >= m || visit[row][col] == true || word.charAt(idx) != board[row][col]) return false;
        visit[row][col] = true;
        boolean found = 
            backTrack(idx + 1, row - 1, col, visit, board, word)|| 
            backTrack(idx + 1, row, col - 1, visit, board, word)|| 
            backTrack(idx + 1, row + 1, col, visit, board, word)||
            backTrack(idx + 1, row, col + 1, visit, board, word);
        visit[row][col] = false;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        boolean[][] visit = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(backTrack(0, i, j, visit, board, word)) return true;
            }
        }
        return false;
    }
}