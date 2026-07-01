class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int i = 0;
        int j = x;
        long ans = 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            long sqr = (long) mid * mid;
            if(sqr == x) return (int)mid;
            else if(sqr < x) {
                ans = mid;
                i = mid + 1;
            }
            else j = mid - 1;
        }
        return (int) ans;
    }
}