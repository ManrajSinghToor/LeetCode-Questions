class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        } 
        int max = 0;
        boolean flag = false;
        for(int key : map.values()){
            if(key % 2 == 0){
                max += key;
            }
            else {
                max += key - 1;
                flag = true;
            }
        }
       if(!flag) return max;
       else return max + 1;
    }
}