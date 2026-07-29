class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char c : s.toCharArray()){
            res ^= c;
        }
        for(char ch : t.toCharArray()){
            res ^= ch;
        }
        return res;
    }
}