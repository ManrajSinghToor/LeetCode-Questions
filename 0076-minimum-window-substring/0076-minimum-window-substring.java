class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            freq[c]++;
        }

        int i = 0;
        int j = 0;
        int st = 0;
        int req = t.length();
        int min = Integer.MAX_VALUE;
        while(j < s.length()) {
            if(freq[s.charAt(j)] > 0) {
                req--;
            }
            freq[s.charAt(j)]--;
            j++;
            while(req == 0){
                if(j - i < min){
                    min = j - i;
                    st = i;
                }
                char leftChar = s.charAt(i);
                freq[leftChar]++;

                if(freq[leftChar] > 0){
                    req++;
                }
                i++;
            }
        }
        return min == Integer.MAX_VALUE? "" : s.substring(st, st + min);
    }
}