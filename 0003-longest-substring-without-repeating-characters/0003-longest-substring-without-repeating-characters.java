class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < n){
            char c = s.charAt(i);
            char ch = s.charAt(j);
            if(set.contains(ch)){
                set.remove(c);
                i++;
            }
            else {
                set.add(ch);
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
    }
}