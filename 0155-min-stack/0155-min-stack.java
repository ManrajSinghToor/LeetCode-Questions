class MinStack {
    Stack<Integer> s1;
    Stack<Integer> minStack;
    public MinStack() {
        s1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        if(minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
        else minStack.push(minStack.peek());
        s1.push(value);
    }
    
    public void pop() {
        s1.pop();
        minStack.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */