class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        // int count = 0;
        for(int i = heights.length - 1; i >= 0; i--){
            int count = 0;
            while(st.size() > 0 && st.peek() <= heights[i]) {
                count++;
                st.pop();
            }
            if(st.size() == 0) ans[i] = count;
            else ans[i] = count + 1;
            st.push(heights[i]);
        }
        return ans;
    }
}