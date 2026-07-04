class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2 = -1;
        while (n > 0) {
            int ld = n % 10;
            if (ld >= max1) {
                max2 = max1;
                max1 = ld;
            } else if (ld > max2) {
                max2 = ld;
            }
            n /= 10;
        }
        return max1 * max2;
    }
}