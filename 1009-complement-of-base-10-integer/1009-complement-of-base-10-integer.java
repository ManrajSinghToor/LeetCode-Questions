class Solution {
    public int bitwiseComplement(int n) {
        int original = n;
        int i = 1;
        while(i < n){
            i = (i << 1) | 1;
        }
        return original ^ i; 
    }
}