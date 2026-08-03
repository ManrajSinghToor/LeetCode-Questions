class Solution {
    public int[] buildLps(String s, int n){
        int[] lps = new int[n];
        int i = 1;
        int len = 0;
        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if(len > 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        } 
        return lps;
    }
    public String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = buildLps(combined, combined.length());

        int lastLps = lps[combined.length() - 1];

        String remaining = s.substring(lastLps);
        String add = new StringBuilder(remaining).reverse().toString();

        return add + s;
    }
}