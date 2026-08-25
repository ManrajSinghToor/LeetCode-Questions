class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int prev = points[0][1];
        int arrow = 1;
        int i = 1;
        while(i < points.length) {
            if(prev < points[i][0]){
                arrow++;
                prev = points[i][1];
            }
            i++;
        }
        return arrow;
    }
}