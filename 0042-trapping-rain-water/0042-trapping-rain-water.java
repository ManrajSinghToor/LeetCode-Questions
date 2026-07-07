class Solution {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1;
        int lm = height[i], rm = height[j];
        int ans = 0;
        while(i < j){
            lm = Math.max(lm, height[i]);
            rm = Math.max(rm, height[j]);
            if(lm < rm){
                ans += lm - height[i];
                i++;
            }
            else {
                ans += rm - height[j];
                j--;
            }
        }
        return ans;
    }
}