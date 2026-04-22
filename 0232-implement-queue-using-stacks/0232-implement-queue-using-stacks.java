//This is pop() efficient approach pop() - O(1) and push()- O(n);
class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st = new Stack<>();
    }
    public void insertAtBottom(Stack<Integer> st, int val){
        if(st.size() == 0) {
            st.push(val); 
            return;
        }
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }
    public void push(int x) {  
        if(st.size() == 0) st.push(x);
        else insertAtBottom(st, x);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
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