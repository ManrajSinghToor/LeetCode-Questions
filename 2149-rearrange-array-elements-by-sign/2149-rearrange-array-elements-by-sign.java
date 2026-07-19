class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int except = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                except = i;
                ans[0] = nums[i];
                break;
            }
        }
        int neg = 1;
        int pos = neg + 1;
        for(int i = 0; i < nums.length; i++){
            if(neg < nums.length && nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            }
            if(pos < nums.length && nums[i] > 0){
                if(i == except) continue;
                ans[pos] = nums[i];
                pos += 2;
            }
        }
        return ans;
    }
}