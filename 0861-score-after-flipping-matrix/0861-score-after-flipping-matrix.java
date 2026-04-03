class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 0)
            for(int j = 0; j < m; j++){
                grid[i][j] ^= 1;
            }
        }
        for(int i = 0; i < m; i++){
            int zeroes = 0;
            int ones = 0;
            for(int j = 0; j < n; j++){
                if(grid[j][i] == 0) zeroes++;
                else ones++;
            }
            if(zeroes > ones){
                for(int idx = 0; idx < n; idx++){
                    grid[idx][i] ^= 1;
                }
            }
        }
        int sum = 0, pow = 1;
        for(int i = m - 1; i >= 0; i--){
            int ones = 0;
            for(int j = 0; j < n; j++){
                if(grid[j][i] == 1) ones++;
            }
            sum += pow * ones;
            pow *= 2;
        }
        return sum;
    }
}