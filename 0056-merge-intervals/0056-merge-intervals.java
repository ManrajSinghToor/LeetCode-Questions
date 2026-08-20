class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int []> res = new ArrayList();
        int[] prev = intervals[0];
        res.add(prev);
        for(int i = 1;i < intervals.length; i++){
            int ps = prev[0];
            int pe = prev[1];
            int cs = intervals[i][0];
            int ce = intervals[i][1];
            if(cs <= pe) prev[1] = Math.max(pe, ce);
            else {
                prev = intervals[i]; 
                res.add(prev);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}