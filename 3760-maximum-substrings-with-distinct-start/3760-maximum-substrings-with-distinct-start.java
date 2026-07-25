class Solution {
    public int maxDistinct(String s) {
        Set<Character> set = new HashSet<>();
        int sub = 0;
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))) sub++;
            set.add(s.charAt(i));
        }
        return sub;
    }
}