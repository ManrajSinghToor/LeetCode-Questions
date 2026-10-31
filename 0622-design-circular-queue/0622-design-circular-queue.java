class MyCircularQueue {
    int[] arr;
    int cap;
    int front;
    int rear;
    int size;
    public MyCircularQueue(int k) {
        this.cap = k;
        this.arr = new int[k];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if(size == cap) return false;
        rear = (rear + 1) % cap;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0) return false;
        front = (front + 1) % cap;
        size--;
        return true;
    }
    
    public int Front() {
        if(size == 0) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(size == 0) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */