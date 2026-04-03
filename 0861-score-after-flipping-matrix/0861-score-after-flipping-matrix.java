class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i < m; i++){
            if(arr[i][0] == 0){
                for(int j = 0; j < n; j++){
                    arr[i][j] ^= 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            int zeroCnt = 0;
            int oneCnt = 0;
            for(int j = 0; j < m; j++){
                if(arr[j][i] == 0) zeroCnt++;
                else oneCnt++;
            }
            if(zeroCnt > oneCnt) {
                for(int idx = 0; idx < m; idx++){
                    arr[idx][i] ^= 1;
                }
            }
        }
        int sum = 0;
        int pow = 1;
        for(int i = n - 1; i >= 0; i--){
            int ones = 0;
            for(int j = 0; j < m; j++) {
                if(arr[j][i] == 1) ones++;
            }
            sum += pow * ones;
            pow *= 2; 
        }
        return sum;
    }
}