class MinStack {
    Stack<Integer> st;
    int min;
    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val < min){
            st.push(val + (val - min));
            min = val;
        } 
        else st.push(val);
    }
    
    public void pop() {
        if(st.peek() < min) min = 2 * min - st.peek();
        else st.pop();
    }
    
    public int top() {
        if(st.peek() < min) return 2 * min - st.peek();
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */