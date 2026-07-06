class Solution {
    public boolean isPalin(int i, int j, String s){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        boolean ans = true;
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalin(i, j - 1, s) || isPalin(i + 1, j, s);
            }
            else {
                i++;
                j--;
            }
        }   
        return ans;
    }
}