class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[heights.length];
        nse[heights.length - 1] = heights.length;
        st.push(heights.length - 1);
        for(int i = heights.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size() == 0) nse[i] = heights.length;
            else nse[i] = st.peek();
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        int[] pse = new int[heights.length];
        pse[0] = -1;
        st.push(0);
        for(int i = 0; i < heights.length; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        int area = 0;
        for(int i = 0; i < heights.length; i++) {
            area = Math.max(area, heights[i] * (nse[i] - pse[i] - 1));
        }
        return area;
    }
}