class Solution {
    public int matrixScore(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < row; i++){
            if(grid[i][0] == 0) 
            for(int j = 0; j < cols; j++){
                grid[i][j] ^= 1;
            }
        }
        for(int i = 0; i < cols; i++){
            int zeroCnt = 0, onesCnt = 0;
            for(int j = 0; j < row; j++){
                if(grid[j][i] == 0) zeroCnt++;
                else onesCnt++;
            }
            if(zeroCnt > onesCnt){
                for(int idx = 0; idx < row; idx++){
                    grid[idx][i] ^= 1;
                }
            }
        }
        int sum = 0, pow = 1;
        for(int i = cols - 1; i >= 0; i--){
            int ones = 0;
            for(int j = 0; j < row; j++){
                if(grid[j][i] == 1) ones++;
            }
            sum += pow * ones;
            pow *= 2;
        }
        return sum;
    }
}