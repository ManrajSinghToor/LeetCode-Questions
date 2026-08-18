class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 1;
        while(i < sb.length() - 1){
            if(sb.charAt(i - 1) == sb.charAt(i) && sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
            }
            else i++;
        } 
        return sb.toString();
    }
}