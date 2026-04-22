//THis is push efficient Approach push at O(1) whereas pop at O(n):-
class MyQueue {
    Stack<Integer> st;
    Stack<Integer> st2;
    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size() > 1) {
            st2.push(st.pop());
        }
        int top = st.pop();
        while(st2.size() > 0) {
            st.push(st2.pop());
        }
        return top;
    }
    
    public int peek() {
        if(st.isEmpty()) return -1;

        while(st.size() > 1) st2.push(st.pop());
        int top = st.peek();
        while(st2.size() > 0) st.push(st2.pop());
        return top;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */