class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            char ch = sb.charAt(i);
            char c = sb.charAt(j);
            if (Character.isLetter(ch) && Character.isLetter(c)) {
                char temp = ch;
                sb.setCharAt(i, c);
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else if (!Character.isLetter(ch))
                i++;
            else if (!Character.isLetter(c))
                j--;
        }
        return sb.toString();
    }
}