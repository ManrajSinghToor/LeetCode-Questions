class Solution {
    static int[][] dp;
    public int dist(int i, int j, StringBuilder sb1, StringBuilder sb2) {
        if(j < 0) return i + 1;
        if(i < 0) return j + 1;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(sb1.charAt(i) == sb2.charAt(j)) {
            return dist(i - 1, j - 1, sb1, sb2);
        }
        else {
            int replace = 1 + dist(i - 1, j - 1, sb1, sb2);
            int delete = 1 + dist(i - 1, j, sb1, sb2);
            int insert = 1 + dist(i, j - 1, sb1, sb2);
            ans = Math.min(insert, Math.min(delete, replace));
        }
        dp[i][j] = ans;
        return ans;
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new int[n][m];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return dist(n - 1, m - 1, new StringBuilder(word1), new StringBuilder(word2));
    }
}