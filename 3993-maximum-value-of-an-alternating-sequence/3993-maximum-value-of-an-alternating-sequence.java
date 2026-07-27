class Solution {
    public long maximumValue(int n, int s, int m) {
        long[] arr = {n, s, m};

        if (n == 1) return s;
        long peaks = n / 2;
        long ans = (long) peaks * (m - 1) + 1;
        return (long)s + ans;
    }
}