class Solution {
    public int minBitFlips(int start, int goal) {
        int diff = start ^ goal;
        int steps = 0;
        for(int i = 0; i < 31; i++){
            if((diff >> i) % 2 != 0) steps++;
        }
        return steps;
    }
}