class Solution {
    public int[] buildLps(String s, int n){
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
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
                else i++;
            }
        }
        return lps;
    }
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = buildLps(s, n);

        int lastLps = lps[n - 1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < lastLps; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}