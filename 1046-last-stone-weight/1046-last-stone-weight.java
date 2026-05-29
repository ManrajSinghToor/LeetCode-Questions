class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones){
            pq.add(ele);
        }
        while(pq.size() > 1){
            int top = pq.remove();
            int top2 = pq.remove();
            if(top - top2 > 0) pq.add(top - top2);
        }
        if(pq.size() == 0) return 0;
        else return pq.peek();
    }
}