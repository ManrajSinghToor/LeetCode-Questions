class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(piles[i], max);
        }

        int i = 1;
        int j = max;
        int ans = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            long hours = 0;
            for(int idx = 0; idx < piles.length; idx++){
                if(piles[idx] % mid == 0) hours += (piles[idx]/mid);
                else hours += (piles[idx]/mid + 1);
            }
            if(hours <= h) {
                ans = mid;
                j = mid - 1;
            }
            else i = mid + 1;
        }
        return ans;
    }
}