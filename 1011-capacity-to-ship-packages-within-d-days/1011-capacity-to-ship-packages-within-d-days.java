class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int ele : weights){
            max = Math.max(ele, max);
            sum += ele;
        }
        int low = max;
        int high = sum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int day = 0;
            int cap = 0;
            for(int i = 0; i < weights.length; i++){
                if(cap + weights[i] <= mid) cap += weights[i];
                else {
                    cap = weights[i];
                    day++;
                }
            }
            day++;
            if(day <= days){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}