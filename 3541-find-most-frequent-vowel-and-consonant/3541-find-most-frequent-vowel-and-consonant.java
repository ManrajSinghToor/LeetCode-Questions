class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        int vowelFreq = 0;
        int consoFreq = 0;
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
                vowelFreq = Math.max(vowelFreq, map.get(key));
            } 

            if(!(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u')) {
                consoFreq = Math.max(consoFreq, map.get(key));
            }
        }
        return vowelFreq + consoFreq;
    }
}