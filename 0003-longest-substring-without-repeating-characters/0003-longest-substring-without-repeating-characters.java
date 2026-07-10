class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            char c = s.charAt(i);
            char ch = s.charAt(j);
            if(set.contains(ch)) {
                set.remove(c);
                i++;
            }
            else {
                set.add(ch);
                max = Math.max((j - i + 1), max);
                j++;
            }
        }
        return max;
    }
}