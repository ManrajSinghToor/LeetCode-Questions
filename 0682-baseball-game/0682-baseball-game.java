class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(int i = 0; i < operations.length; i++){
            String ch = operations[i];
            if(ch.equals("+")){
                int top = st.pop();
                int sum = st.peek() + top;
                st.push(top);
                st.push(sum);
            }
            else if(ch.equals("D")){
                int top = st.peek();
                st.push(top * 2);
            }
            else if(ch.equals("C")){
                int top = st.pop();
            }
            else {
                st.push(Integer.parseInt(ch));
            }
        }
        while(!st.isEmpty()){
            score += st.pop();
        }
        return score;
    }
}