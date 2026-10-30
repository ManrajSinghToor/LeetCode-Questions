class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int newScore = 0;
        for(int i = 0; i < operations.length; i++) {
            String word = operations[i];
            if(word.equals("+")) {
                int top = st.pop();
                int stop = st.peek();
                int newScor = top + stop;
                st.push(top);
                st.push(newScor);
            }
            else if(word.equals("D")) {
                int top = st.peek();
                st.push(top * 2);
            }
            else if(word.equals("C")) {
                st.pop();
            }
            else {
                int num = Integer.parseInt(word);
                st.push(num);
            }
        }
        while(!st.isEmpty()) {
            newScore += st.pop();
        }
        return newScore;
    }
}