class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int ld = x % 10;
            if(rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            x /= 10;
            rev = rev*10+ld;
        }
        return rev;
    }
}