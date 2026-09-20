class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            int c = (s.charAt(i) - '0') - '0';
            ans += ((i + 1) * (27 - c));
        }
        return ans;
    }
}