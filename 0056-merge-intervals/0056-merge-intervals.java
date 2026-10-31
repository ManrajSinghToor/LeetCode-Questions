class inter implements Comparable<inter> {
    int st;
    int et;
    inter(int st, int et) {
        this.st = st;
        this.et = et;
    }
    public int compareTo(inter i) {
        return Integer.compare(this.st, i.st);
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        List<inter> list = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++) {
            list.add(new inter(intervals[i][0], intervals[i][1]));
        }

        Collections.sort(list);
        List<inter> ans = new ArrayList<>();
        inter prev = list.get(0);
        ans.add(prev);
        for(int i = 1; i < list.size(); i++) {
            inter curr = list.get(i);
            if(curr.st <= prev.et) {
                prev.et = Math.max(curr.et, prev.et);
            }
            else {
                prev = curr;
                ans.add(prev);
            }
        }

        int[][] res = new int[ans.size()][2];
        for(int i = 0; i < res.length; i++) {
            res[i][0] = ans.get(i).st;
            res[i][1] = ans.get(i).et;
        }
        return res;
    }
}