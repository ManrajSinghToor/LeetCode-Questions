class Solution {
    public boolean detectCapitalUse(String word) {
        int Cnt = 0;
        for(char c : word.toCharArray()){
            if(Character.isUpperCase(c)) Cnt++;
        }
        if(Cnt == word.length()) return true;
        if(Cnt == 0) return true;
        if(Cnt == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}