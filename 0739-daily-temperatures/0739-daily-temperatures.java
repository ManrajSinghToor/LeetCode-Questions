class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.size() == 0) ans[i] = 0;
            else ans[i] = st.peek() - i;
            st.push(i);
        } 
        return ans;
    }
}