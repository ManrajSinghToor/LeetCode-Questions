class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // int[] freq = new int[26];
        // for(int i = 0; i < s.length(); i++){
        //     freq[s.charAt(i) - 'a']++;
        //     freq[t.charAt(i) - 'a']--;
        // }
        // for(int count : freq){
        //     if(count != 0) return false;
        // }
        // return true;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ele = s.charAt(i);
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}