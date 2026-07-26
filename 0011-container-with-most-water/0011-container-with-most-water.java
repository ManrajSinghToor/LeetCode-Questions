class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(i < j){
            int h = Math.min(height[j], height[i]);
            int width = j - i;
            max = Math.max(max, h * width);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}