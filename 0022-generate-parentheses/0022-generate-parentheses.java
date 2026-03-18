class Solution {
    public void recurs(int n, List<String> ans, int right, int left, String s){
        if(right == 0){
            ans.add(s);
            return;
        }
        if(left > 0){
            recurs(n, ans, right, left - 1, s + '(');
        }
        if(right > left){
            recurs(n, ans, right - 1, left, s + ')');
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recurs(n, ans, n, n, "");
        return ans;
    }
}