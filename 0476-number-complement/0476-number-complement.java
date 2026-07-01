class Solution {
    public int findComplement(int num) {
        int original = num;
        int i = 1;
        while(i < num){
            i = (i << 1) | 1;
        }
        return original ^  i;
    }
}