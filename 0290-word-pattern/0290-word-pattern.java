class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        String[] arr = s.split(" ");

        if(pattern.length() != arr.length) return false;

        for(int i = 0; i < arr.length; i++){
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(!map.containsKey(word)){
                if(set.contains(ch)){
                    return false;
                }
                map.put(word,ch);
                set.add(ch);
            }
            else{
                if(map.get(word) != ch){
                    return false;
                }
            }
        }
        return true;
    }
}