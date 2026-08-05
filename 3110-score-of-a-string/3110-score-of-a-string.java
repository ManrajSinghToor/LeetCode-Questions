class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i = 1; i < s.length(); i++){
            int c = (int)s.charAt(i);
            int ch = (int) s.charAt(i - 1);
            int diff = Math.abs(c - ch);
            ans += diff;
        }
        return ans;
    }
}