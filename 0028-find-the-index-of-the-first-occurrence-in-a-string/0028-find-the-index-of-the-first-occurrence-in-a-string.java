class Solution {
    public int strStr(String s, String t) {
        int idx = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.startsWith(t,i)){
                idx = i;
                break;
            }
        }
        return idx;
    }
}