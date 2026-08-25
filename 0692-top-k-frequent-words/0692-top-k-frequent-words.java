class Pair implements Comparable<Pair> {
    String key;
    int val;
    Pair(String key, int val) {
        this.key = key;
        this.val = val;
    }
    public int compareTo(Pair p) {
        if(this.val == p.val) return (p.key).compareTo(this.key);
        return this.val - p.val;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])) map.put(words[i], map.get(words[i]) + 1);
            else map.put(words[i], 1);
        }
        for(String key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
            if(pq.size() > k) pq.remove();
        }
        List<String> ans = new ArrayList<>();
        while(!pq.isEmpty()) {
            Pair p = pq.remove();
            ans.add(p.key);
        }
        Collections.reverse(ans);
        return ans;
    }
}