class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; 
        int j = 0;
        int cnt = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) != t.charAt(j)){
                i++;
            }
            else {
                i++;
                j++;
            }
        }
        if(j == t.length()) return 0;
        else {
            cnt += t.length() - j;
            return cnt;
        }
    }
}