class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i = heights.length - 1; i >= 0; i--){
            int cnt = 0;
            while(st.size() > 0 && st.peek() <= heights[i]) {
                cnt++;
                st.pop();
            }
            if(st.size() == 0) ans[i] = cnt;
            else ans[i] = cnt + 1;
            st.push(heights[i]);
        }
        return ans;
    }
}