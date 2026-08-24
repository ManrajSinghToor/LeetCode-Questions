class MedianFinder {
    PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;
    public MedianFinder() {
        minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
    }
    public void addNum(int num) {
        if(maxheap.size() == 0) maxheap.add(num);
        else {
            if(num > maxheap.peek()) minheap.add(num);
            else maxheap.add(num);
        }
        if(maxheap.size() == minheap.size() + 2) minheap.add(maxheap.remove());
        if(minheap.size() == maxheap.size() + 2) maxheap.add(minheap.remove());
    }
 
    public double findMedian() {
        if(maxheap.size() == minheap.size() + 1) return (double)maxheap.peek();
        else if(maxheap.size() + 1 == minheap.size()) return (double)minheap.peek();
        else {
            double one = (double) maxheap.peek();
            double two = (double) minheap.peek();
            return (one + two) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */