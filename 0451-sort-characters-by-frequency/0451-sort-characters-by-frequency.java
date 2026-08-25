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
        int[] freq = new int[128];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[(int)c]++;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < 128; i++) {
            if(freq[i] > 0) pq.add(new Pair((char) i, freq[i]));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            Pair top = pq.remove();
            int frequency = top.val;
            while(frequency-- > 0) {
                sb.append((char) top.key);
            }
        }
        return sb.toString();
    }
}