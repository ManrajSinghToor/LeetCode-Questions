class Solution {
    public int minMoves(int[] nums) {
        int mx = 0;
        for(int i = 0; i < nums.length; i++) {
            mx = Math.max(nums[i], mx);
        }
        int moves = 0;
        for(int i = 0; i < nums.length; i++) {
            moves += (mx - nums[i]);
        }
        return moves;
    }
}