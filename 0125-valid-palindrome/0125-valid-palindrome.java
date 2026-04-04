class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        String res = sb.toString();
        res = res.toLowerCase();
        int i = 0, j = res.length() - 1;
        while(i < j){
            if(res.charAt(i) != res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}