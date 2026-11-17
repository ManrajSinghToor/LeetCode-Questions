class Solution {
    static Boolean[][] dp;
    public boolean wildy(int i, int j, String s, String p) {
        if(i < 0 && j < 0) return true;
        if(i >= 0 && j < 0) return false;
        if(i < 0 && j >= 0) {
            for(int c = j; c >= 0; c--) {
                if(p.charAt(c) != '*') return false;
            }
            return true;
        }
        if(dp[i][j] != null) return dp[i][j];
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            return dp[i][j] = wildy(i - 1, j - 1, s, p);
        }
        if(p.charAt(j) == '*') {
            boolean pick = wildy(i - 1, j, s, p);
            boolean skip = wildy(i, j - 1, s, p);
            return dp[i][j] = pick || skip;
        }
        return dp[i][j] = false;
            
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        dp = new Boolean[n][m];
        return wildy(n - 1, m - 1, s, p);
    }
}