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
                if(len > 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int n = s.length();
        int[] lps = buildLps(goal, goal.length());
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s);

        int i = 0;
        int j = 0;
        while(i < sb.length()){
            if(sb.charAt(i) == goal.charAt(j)){
                i++;
                j++;
                if(j == goal.length()) return true;
            }
            else {
                if(j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return false;
    }
}