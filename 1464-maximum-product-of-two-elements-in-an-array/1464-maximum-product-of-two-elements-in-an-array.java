class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            pq.add(ele);
        }
        int first = pq.remove() - 1;
        int second = pq.remove() - 1;
        
        return first * second;
    }
}