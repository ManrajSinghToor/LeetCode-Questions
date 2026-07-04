class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int ele : piles){
            max = Math.max(ele, max);
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low <= high){
            int speed = low + (high - low) / 2;
            long hrs = 0;
            for(int banana : piles){
                if(banana % speed == 0) hrs += (banana/speed);
                else hrs += (banana/speed + 1);
            }
            if(hrs <= h) {
                ans = speed;
                high = speed - 1;
            }
            else low = speed + 1;
        }
        return ans;
    }
}