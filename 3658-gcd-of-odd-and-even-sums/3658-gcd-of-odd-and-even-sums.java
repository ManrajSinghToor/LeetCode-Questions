class Solution {
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        if(n <= 3) return n;
        int sumOdd = 0;
        int sumEven = 0;
        int cnt = 0;
        int range = (n * n) / 2;
        for(int i = 1; i <= range; i++){
            if(cnt == (n * 2)) break;
            if(i % 2 != 0) {
                sumOdd += i;
                cnt++;
            }
            else {
                sumEven += i;
                cnt++;
            }
        }
        return gcd(sumOdd, sumEven);
    }
}