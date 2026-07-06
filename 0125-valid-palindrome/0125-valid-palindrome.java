class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) newStr += s.charAt(i);
        }
        newStr = newStr.toLowerCase();
        int i = 0, j = newStr.length() - 1;
        while(i <= j){
            if(newStr.charAt(i) != newStr.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}