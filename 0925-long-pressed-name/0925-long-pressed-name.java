class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < typed.length(); i++){
        //     char c = typed.charAt(i);
        //     if(map.containsKey(c)) map.put(c, map.get(c) + 1);
        //     else map.put(c, 1);
        // }
        // for(int i = 0; i < name.length(); i++) {
        //     char ch = name.charAt(i);
        //     if(!map.containsKey(ch) || map.get(ch) < 0) return false;
        //     else map.put(ch, map.get(ch) - 1); 
        // }
        // return true;

        int i = 0;
        int j = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)) j++;
            else return false;
        }
        return i == name.length();
    }
}