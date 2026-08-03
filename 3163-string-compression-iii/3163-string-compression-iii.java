class Solution {
    public String compressedString(String word) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(j < word.length()){
            char curr = word.charAt(j);
            int cnt = 0;
            while(j < word.length() && curr == word.charAt(j)) {
                cnt++;
                j++;
            }
            while(cnt > 9) {
                sb.append(9);
                sb.append(curr);
                cnt -= 9;
            }

            if(cnt > 0) {
                sb.append(cnt);
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}