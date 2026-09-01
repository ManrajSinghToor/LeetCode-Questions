class Solution {
    public void backTrack(int idx, String s, StringBuilder sb, List<String> ans) {
        if(idx == s.length()) {
            ans.add(sb.toString());
            return ;
        }
        char c = s.charAt(idx);
        if(!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
            sb.append(c);
            backTrack(idx + 1, s, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        else {
            sb.append(Character.toLowerCase(c));
            backTrack(idx + 1, s, sb, ans);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(c));
            backTrack(idx + 1, s, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backTrack(0, s, new StringBuilder(), ans);
        return ans;
    }
}