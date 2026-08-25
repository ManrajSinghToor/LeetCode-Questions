class Triplet implements Comparable<Triplet> {
    int ele;
    int r;
    int c;
    Triplet(int ele, int r, int c) {
        this.ele = ele;
        this.r = r;
        this.c = c;
    }
    public int compareTo(Triplet t) {
        return this.ele - t.ele;
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //T.C - O(n log k) S.C - O(k);
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i = 0; i < matrix.length; i++) {
            pq.add(new Triplet(matrix[i][0], i, 0));
        }
        while(k > 1) {
            Triplet top = pq.remove();
            int row = top.r;
            int col = top.c;

            if(col + 1 < matrix[0].length) {
                pq.add(new Triplet(matrix[row][col + 1], row, col + 1));
            }
            k--;
        }
        Triplet top = pq.remove();
        return top.ele;
    }
}