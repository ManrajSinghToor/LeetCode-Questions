class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(c >= 'a' && c <= 'z' && !set.contains(c)){
                char need = (char) (c - 32);
                if(word.indexOf(need) != -1) {
                    count++;
                    set.add(c);
                }
            }
        }
        return count;
    }
}