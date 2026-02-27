class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for(char ch : chars.toCharArray()){
            charCount[ch - 'a']++;
        }
        int result = 0;
        for(String word : words){
            int[] wordCount = new int[26];
            for(char w : word.toCharArray()){
                wordCount[w - 'a']++;
            }
            boolean ans = true;
            for(int i = 0; i < 26; i++){
                if(wordCount[i] > charCount[i]){
                    ans = false;
                    break;
                }
            }
            if(ans == true) result += word.length();
        }
        return result;
    }
}