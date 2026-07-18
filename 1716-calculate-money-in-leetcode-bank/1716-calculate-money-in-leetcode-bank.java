class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int lastMon = 2;
        int days = 1;
        for(int i = 1; i <= n; i++){
            sum += days;
            days++;
            if(i % 7 == 0) {
                days = lastMon;
                lastMon++;
            }
        }
        return sum;
    }
}