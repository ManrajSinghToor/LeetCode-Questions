class Pair implements Comparable<Pair> {
    int key;
    int val;
    Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }
    public int compareTo(Pair p) {
        if(p.val == this.val) return this.key - p.key;
        return p.val - this.val;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(char key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            Pair top = pq.remove();
            int freq = top.val;
            while(freq-- > 0) {
                sb.append((char) top.key);
            }
        }
        return sb.toString();
    }
}