class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            while(set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max = Math.max((j - i + 1), max);
            j++;
        }
        return max;
    }
}