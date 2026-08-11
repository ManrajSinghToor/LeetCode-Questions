class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i : nums){
            pq.add(i);
        }
        while(k-- > 0){
            pq.add(-pq.remove());
        }
        int sum = 0;
        for(int i : pq) {
            sum += i;
        }
        return sum;
    }
}