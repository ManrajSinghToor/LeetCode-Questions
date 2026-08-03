class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int i = 0;
        int j = 0;
        while(j < chars.length){
            char curr = chars[j];
            int cnt = 0;
            while(j < chars.length && curr == chars[j]) {
                cnt++;
                j++;
            }
            chars[i++] = curr;
            if(cnt > 1) {
                String s = Integer.toString(cnt);
                for(char c : s.toCharArray()) {
                    chars[i++] = c;
                }
            }
        }
        return i;
    }
}