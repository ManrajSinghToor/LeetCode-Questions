class Solution {
    public int minBitFlips(int start, int goal) {
        int mask = start ^ goal;
        int flips = 0;
        for(int i = 0; i < 31; i++){
            if((mask >> i) % 2 != 0) flips++;
        }
        return flips;
    }
}