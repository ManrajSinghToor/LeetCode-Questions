class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int i = 0;
        int j = n - 1;
        while(i < j){
            char ch = sb.charAt(i);
            char c = sb.charAt(j);
            if(Character.isLetter(ch) && Character.isLetter(c)){
                char temp = ch;
                sb.setCharAt(i, c);
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            else if(!Character.isLetterOrDigit(ch)) i++;
            else if(!Character.isLetterOrDigit(c)) j--;
        }
        i = 0; 
        j = n - 1;
        while(i < j){
            char ch = sb.charAt(i);
            char c = sb.charAt(j);
            if(!Character.isLetterOrDigit(ch) && !Character.isLetterOrDigit(c)){
                char temp = ch;
                sb.setCharAt(i, c);
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            else if(Character.isLetter(ch)) i++;
            else if(Character.isLetter(c)) j--;
        }
        return sb.toString();
    }
}