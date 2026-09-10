class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') st.push(c);
            else {
                if(st.isEmpty()) return false;
                else {
                    char top = st.pop();
                    if(c == ')' && top != '(' 
                    || c == ']' && top != '[' 
                    || c == '}' && top != '{') return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}