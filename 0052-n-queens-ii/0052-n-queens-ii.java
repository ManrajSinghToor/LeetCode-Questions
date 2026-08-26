class Solution {
    static int count;
    public int totalNQueens(int n) {
        if(n == 1) return 1;
        char[][] chessBoard = new char[n][n];
        count = 0;
        nQueens(0, chessBoard);
        return count;
    }
    public void nQueens(int row, char[][] chessBoard) {
        int n = chessBoard.length;
        if(row == n) {
            count++;
            return ;
        }    
        for(int col = 0; col < n; col++) {
            if(isSafe(row, col, chessBoard)) {
                chessBoard[row][col] = 'Q';
                nQueens(row + 1, chessBoard);
                chessBoard[row][col] = ' ';
            }
        }
    }
    public boolean isSafe(int row, int col, char[][] chessBoard) {
        int i = row - 1;
        while(i >= 0) {
            if(chessBoard[i][col] == 'Q') return false;
            i--;
        }
        i = row - 1;
        int j = col - 1;
        while(i >= 0 && j >= 0) {
            if(chessBoard[i][j] == 'Q') return false;
            i--;
            j--;
        }
        i = row - 1;
        j = col + 1;
        while(i >= 0 && j < chessBoard.length) {
            if(chessBoard[i][j] == 'Q') return false;
            i--;
            j++;
        }
        return true;
    }
}