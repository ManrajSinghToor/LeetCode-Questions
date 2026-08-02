class Solution {
    public int[] builtLps(String s, int n){
        int[] lps = new int[n];
        int i = 1;
        int len = 0;
        lps[0] = 0;
        while(i < n){
            if(s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if(len > 0){
                    len = lps[len - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = builtLps(s, n);
        int lastLPS = lps[n - 1];

        return lastLPS > 0 && n % (n - lastLPS) == 0;
    }
}