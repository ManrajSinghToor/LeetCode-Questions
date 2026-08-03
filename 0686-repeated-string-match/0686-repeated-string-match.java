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
    public int repeatedStringMatch(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[] lps = buildLps(b, m);

        StringBuilder repeatA = new StringBuilder();
        while(repeatA.length() < m){
            repeatA.append(a);
        } 
        repeatA.append(a);

        int i = 0;
        int j = 0;
        while(i < repeatA.length()){
            if(repeatA.charAt(i) == b.charAt(j)){
                i++;
                j++;
                if(j == m) return (i + a.length() - 1) / a.length();
            }
            else {
                if(j != 0) j = lps[j - 1]; 
                else i++;
            }
        }
        return -1;
    }
}