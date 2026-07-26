class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
        int i = max;
        int j = sum;
        int ans = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            int d = 0;
            int cap = 0;
            for(int idx = 0; idx < weights.length; idx++){
                if(cap + weights[idx] <= mid) cap += weights[idx];
                else {
                    cap = weights[idx];
                    d++;
                }
            }
            d++;
            if(d <= days) {
                ans = mid;
                j = mid - 1;
            }
            else i = mid + 1;
        }
        return ans;
    }
}