class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }
        int cnt = 1;
        while(q.size() > 1) {
            if(cnt == k) {
                q.remove();
                cnt = 1;
            }
            else {
                cnt++;
                q.add(q.remove());
            }
        }
        return q.peek();
    }
}