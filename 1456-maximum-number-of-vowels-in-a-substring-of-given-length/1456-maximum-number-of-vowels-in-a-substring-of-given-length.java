class Solution {
    public int maxVowels(String s, int k) {
        //T.C - O(n), S.C - O(1)
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while(j < s.length()){
            char ch = s.charAt(i);
            char c = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') sum++;
            if(j - i + 1 == k){
                max = Math.max(max, sum);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    sum -= 1;
                }
                i++;
            }
            j++;
        }
        return max;
    }
}