class Solution {
    public String reverseWords(String s) {
        int l = 0;
        while(l < s.length()){
            if(s.charAt(l) == ' ') l++;
            else break;
        }
        int r = s.length() - 1;
        while(r >= 0){
            if(s.charAt(r) == ' ') r--;
            else break;
        }

        StringBuilder sb = new StringBuilder();
        while(l <= r){
            char ch = s.charAt(l);
            if(ch != ' ') sb.append(ch);
            else if(ch == ' ' && sb.charAt(sb.length() - 1) != ' ') sb.append(ch);
            l++;
        }

        int i = 0;
        int j = sb.length() - 1;
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }

        int start = 0;
        while (start < sb.length()) {
            int end = start;
            while (end < sb.length() && sb.charAt(end) != ' ') end++;
            int left = start;
            int right = end - 1;

            while (left < right) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            start = end + 1;
        }
        return sb.toString();
    }
}