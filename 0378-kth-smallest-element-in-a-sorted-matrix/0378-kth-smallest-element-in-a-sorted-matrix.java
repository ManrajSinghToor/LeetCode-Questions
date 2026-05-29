class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length * matrix[0].length <= 1) return matrix[0][0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                pq.add(matrix[i][j]);
            }
        }
        while(k-- > 1){
            pq.remove();
        }
        return pq.peek();
    }
}