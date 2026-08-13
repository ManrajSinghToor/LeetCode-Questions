class Triplet implements Comparable<Triplet>{
    int x;
    int y;
    int dist;
    Triplet(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
    public int compareTo(Triplet t) {
        return t.dist - this.dist;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int[][] ans = new int[k][2];
        for(int a[] : points){
            int x = a[0], y = a[1];
            int dist = x * x + y * y;
            pq.add(new Triplet(x, y, dist));
            if(pq.size() > k) pq.remove();
        }
        int i = 0;
        while(!pq.isEmpty()) {
            Triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
            i++;
        }
        return ans;
    }
}