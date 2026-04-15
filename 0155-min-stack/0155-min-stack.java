class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        long x = (long) val;
        if (st.isEmpty()) {
            st.push(x);
            min = x;
        } 
        else if(x >= min) st.push(x);
        else {
            st.push(2 * x - min);
            min = x;
        }
    }
    
    public void pop() {
        if(st.peek() >= min) st.pop();
        else if(st.peek() < min){
            long old = 2 * min - st.peek();
            min = old;
            st.pop();
        }
    }
    
    public int top() {
        long ans = st.peek();
        if(ans >= min) return (int) ans;
        else return (int) min;
    } 
    
    public int getMin() {
        return (int)min;
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