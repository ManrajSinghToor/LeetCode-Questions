class Solution {
    public void recurs(char[] s, int i, int j){
        if(i >= j) return ;  
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;  
        recurs(s, i + 1, j - 1);
    }
    public void reverseString(char[] s) {
        recurs(s, 0, s.length - 1);
    }
}