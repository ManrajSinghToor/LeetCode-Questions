class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        if(arr[0][0] == 1 || arr[n - 1][m - 1] == 1) return 0;
        for(int i = 0; i < n; i++) {
            if(arr[i][0] == 0) dp[i][0] = 1; 
            else break;
        }
        for(int j = 0; j < m; j++) {
            if(arr[0][j] == 0) dp[0][j] = 1;
            else break;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(arr[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }
}