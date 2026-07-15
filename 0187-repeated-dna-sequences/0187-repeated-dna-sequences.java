class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);


        int k = 10;
        int val = 0;
        if(s.length() < k) return new ArrayList<>();
        for(int i = 0; i < k; i++){
            int pow = k - i - 1;
            val += (int) (Math.pow(4, pow) * map.get(s.charAt(i)));
        }
        set1.add(val);
        
        for(int i = k; i < s.length(); i++){
            val -= (int) (Math.pow(4, k - 1) * map.get(s.charAt(i - k)));
            val *= 4;
            val += map.get(s.charAt(i));

            if(set1.contains(val)) set2.add(s.substring(i - k + 1, i + 1));
            set1.add(val);
        }
        return new ArrayList<String>(set2);
    }
}