class Solution {
    public String recurs(String s){
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) cnt++;
            else {
                sb.append(cnt).append(s.charAt(i - 1));
                cnt = 1;
            }
        }
        sb.append(cnt).append(s.charAt(s.length() - 1));
        return sb.toString();
    }
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 2; i <= n; i++){
            res = recurs(res);
        }
        return res;
    }
}