class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char c = t.charAt(i);
            if(!map.containsKey(ch)){
                if(set.contains(c)){
                    return false;
                }
                set.add(c);
                map.put(ch,c);
            }
            else{
                if(map.get(ch) != c){
                    return false;
                }
            }
        }
        return true;
    }
}