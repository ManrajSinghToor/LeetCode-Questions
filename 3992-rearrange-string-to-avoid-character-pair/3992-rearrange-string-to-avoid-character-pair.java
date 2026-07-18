class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == x || c == y) continue;

            while (freq[c - 'a'] > 0) {
                sb.append(c);
                freq[c - 'a']--;
            }
        }
        while (freq[y - 'a'] > 0) {
            sb.append(y);
            freq[y - 'a']--;
        }
        while (freq[x - 'a'] > 0) {
            sb.append(x);
            freq[x - 'a']--;
        }
        return sb.toString();
    }
}