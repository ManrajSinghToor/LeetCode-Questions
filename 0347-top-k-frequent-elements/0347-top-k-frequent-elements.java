class Pair implements Comparable<Pair> {
    int ele;
    int freq;
    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair p) {
        return this.freq - p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : nums) {
            if(map.containsKey(ele)) map.put(ele, map.get(ele) + 1);
            else map.put(ele, 1);
        }
        for(int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
            if(pq.size() > k) pq.remove();
        }
        int[] ans = new int[k];
        int i = 0;
        while(pq.size() > 0) {
            Pair top = pq.remove();
            ans[i++] = top.ele;
        }
        return ans;
    }
}