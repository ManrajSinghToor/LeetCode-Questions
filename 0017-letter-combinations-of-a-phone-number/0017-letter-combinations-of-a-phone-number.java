class Solution {
    public void backTrack(int idx, String digits, String[] ph, StringBuilder sb, List<String> str) {
        if(idx == digits.length()) {
            str.add(sb.toString());
            return ;
        }
        int digit = digits.charAt(idx) - '0';
        String letters = ph[digit];
        for(int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));    
            backTrack(idx + 1, digits, ph, sb, str);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> str = new ArrayList<>();
        String[] phones = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        backTrack(0, digits, phones, sb, str);
        return str;
    }
}