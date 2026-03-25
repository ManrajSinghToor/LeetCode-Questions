class Solution {
    public List<String> toString(char[][] chess){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < chess.length; i++){
            String value = new String(chess[i]);
            list.add(value);
        }
        return list;
    }
    public boolean isValid(char[][] chess, int row, int cols){
        for(int i = 0; i < chess.length; i++){
            if(chess[row][i] == 'Q') return false;
        }
        for(int i = 0; i < chess.length; i++){
            if(chess[i][cols] == 'Q') return false;
        }
        for(int i = row - 1, j = cols - 1; i>= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 'Q') return false;
        }
        for(int i = row - 1, j = cols + 1; i>= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 'Q') return false;
        }
        return true;
    }
    public void nQueens(int n, int row, List<List<String>> ans, char[][] chess){
        if(row == n){
            ans.add(toString(chess));
            return;
        }
        for(int cols = 0; cols < n; cols++){
            if(isValid(chess, row, cols)){
                chess[row][cols] = 'Q';
                nQueens(n, row + 1, ans, chess);
                chess[row][cols] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chess = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chess[i][j] = '.';
            }
        }
        nQueens(n, 0, ans, chess);
        return ans;
    }
}