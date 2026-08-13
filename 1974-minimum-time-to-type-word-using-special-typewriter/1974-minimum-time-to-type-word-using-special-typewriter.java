class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char curr = 'a';
        int i = 0;
        while(i < word.length()) {
            int diff = Math.abs(word.charAt(i) - curr);
            time += Math.min(diff, 26 - diff);
            // time++;
            curr = word.charAt(i);
            i++;
        }
        return time + word.length();
    }
}