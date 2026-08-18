class Solution {
    public String makeFancyString(String s) {
        // StringBuilder sb = new StringBuilder(s);
        // int i = 1;
        // while (i < sb.length() - 1) {
        //     if (sb.charAt(i - 1) == sb.charAt(i)
        //             && sb.charAt(i) == sb.charAt(i + 1)) {
        //         sb.deleteCharAt(i);
        //     } else
        //         i++;
        // }
        // return sb.toString();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(sb.length() > 1 
            && sb.charAt(sb.length() - 1) == s.charAt(i) 
            && sb.charAt(sb.length() - 2) == s.charAt(i)) {
                continue;
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}