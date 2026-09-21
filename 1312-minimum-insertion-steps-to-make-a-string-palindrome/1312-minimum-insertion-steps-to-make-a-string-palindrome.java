class Solution {
    static int[][] dp;
    public int minIn(int i, int j, StringBuilder sb1) {
        if(i == j) return 1;
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(sb1.charAt(i) == sb1.charAt(j)) ans = 2 + minIn(i + 1, j - 1, sb1);
        else {
            int front = minIn(i + 1, j, sb1);
            int back = minIn(i, j - 1, sb1);
            ans = Math.max(front, back);
        }
        dp[i][j] = ans;
        return ans;
    }
    public int minInsertions(String s) {
        int n = s.length();
        dp = new int[n][n];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        int palindrome = minIn(0, n - 1, new StringBuilder(s));
        return n - palindrome;
    }
}