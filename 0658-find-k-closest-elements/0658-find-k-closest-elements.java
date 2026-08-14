class Doublet implements Comparable<Doublet>{
    int point;
    int distance;
    Doublet(int point, int distance) {
        this.point = point;
        this.distance = distance;
    }
    public int compareTo(Doublet d){
        if(this.distance == d.distance) {
            return d.point - this.point;
        }
        return d.distance - this.distance;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Doublet> pq = new PriorityQueue<>();
        for(int ele : arr) {
            int dist = Math.abs(ele - x);
            pq.add(new Doublet(ele, dist));
            if(pq.size() > k) pq.remove();
        }
        List<Integer> list = new ArrayList<>();
        while(pq.size() > 0) {
            Doublet top = pq.remove();
            list.add(top.point);
        }
        Collections.sort(list);
        return list;
    }
}