class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int maxCnt = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            char ch = s.charAt(i);
            char c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                maxCnt = Math.max(maxCnt, j - i + 1);
                j++;
            }
            else {
                set.remove(ch);
                i++;
            }
        }
        return maxCnt;
    }
}