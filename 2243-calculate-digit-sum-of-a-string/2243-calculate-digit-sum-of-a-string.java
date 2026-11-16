class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k) {
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < s.length(); i += k) {
                int sum = 0;
                int len = 0;
                if(i + k < s.length()) len = i + k;
                else len = s.length();
                for(int j = i; j < len; j++) {
                    sum += s.charAt(j) - '0';
                }
                ans.append(sum);
            }
            s = ans.toString();
        }
        return s;
    }
}