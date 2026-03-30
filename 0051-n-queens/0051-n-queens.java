class Solution {
    public List<String> toString(char[][] chess){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < chess.length; i++){
            String ans = new String(chess[i]);
            list.add(ans);
        }
        return list;
    }
    public boolean isValid(int row, int cols, char[][] chess){
        for(int i = 0; i < chess.length; i++){
            if(chess[row][i] == 'Q') return false;
        }
        for(int j = 0; j < chess.length; j++){
            if(chess[j][cols] == 'Q') return false;
        }
        int i = row - 1;
        int j = cols - 1;
        while(i >= 0 && j >= 0){
            if(chess[i][j] == 'Q') return false;
            i--;
            j--;
        }
        int i1 = row - 1;
        int j1 = cols + 1;
        while(i1 >= 0 && j1 < chess.length){
            if(chess[i1][j1] == 'Q') return false;
            i1--;
            j1++;
        }
        return true; 
    }
    public void backTrack(List<List<String>> ans, int row, char[][] chess){
        if(row == chess.length){
            ans.add(toString(chess));
            return;
        }
        for(int cols = 0; cols < chess.length; cols++){
            if(isValid(row, cols, chess)){
                chess[row][cols] = 'Q';
                backTrack(ans, row + 1, chess);
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
        backTrack(ans, 0, chess);
        return ans;
    }
}