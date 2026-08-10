class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        int max = 0;
        boolean flag = false;
        for (int key : freq) {
            if (key % 2 == 0) {
                max += key;
            } else {
                max += key - 1;
                flag = true;
            }
        }
        if (!flag) return max;
        else return max + 1;
    }
}