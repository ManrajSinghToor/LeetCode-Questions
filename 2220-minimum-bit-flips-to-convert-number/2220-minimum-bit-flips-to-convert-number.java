class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int flips = 0;
        // int i = 0;
        for(int i = 0; i < 31; i++){
            if((xor >> i) % 2 != 0) flips++;
        }
        return flips;
    }
}