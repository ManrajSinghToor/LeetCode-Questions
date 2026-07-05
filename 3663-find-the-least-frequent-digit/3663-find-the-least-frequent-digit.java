class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while(n > 0){
            int ld = n % 10;
            if(map.containsKey(ld)){
                map.put(ld, map.get(ld) + 1);
            }
            else {
                map.put(ld, 1);
            }
            n /= 10;
        }
        int maxFreq = Integer.MAX_VALUE;
        int ele = 0;
        for(int key : map.keySet()){
            if(map.get(key) < maxFreq){
                maxFreq = map.get(key);
                ele = key;
            }
        }
        return ele;
    }
}