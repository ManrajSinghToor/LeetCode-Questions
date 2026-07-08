class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = 0;
        while(i < sb.length()){
            while(j < sb.length() && sb.charAt(j) != ' ') j++;
            int left = i;
            int right = j - 1;
            while(left < right){
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            j++;
            i = j;
        }
        return sb.toString();
    }
}