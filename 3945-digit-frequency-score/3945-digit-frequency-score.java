class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while(n > 0){
            int ld = n % 10;
            n /= 10;
            if(map.containsKey(ld)) map.put(ld, map.get(ld) + 1);
            else map.put(ld, 1);
        }
        int sum = 0;
        for(int key : map.keySet()) {
            sum += (key * map.get(key));
        }
        return sum;
    }
}