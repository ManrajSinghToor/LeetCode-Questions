class Solution {
    public String reversePrefix(String word, char ch) {
        int len = 0;
        for(int i= 0; i < word.length(); i++){
            if(word.charAt(i) != ch) len++;
            else break;
        }
        if(len == word.length()) return word;

        Stack<Character> st = new Stack<>();
        String ans = "";
        int i = 0;
        while(i <= len){
            st.push(word.charAt(i));
            i++;
        }
        // st.push(ch);
        while(!st.isEmpty()){
            ans += st.pop();
        }
        while(i < word.length()){
            ans += word.charAt(i);
            i++;
        }
        return ans;
    }
}