class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int maxCnt = 0;
        int i = 0, j = 0;
        while(j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxCnt = Math.max(maxCnt, j - i + 1);
                j++;
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxCnt;
    }
}