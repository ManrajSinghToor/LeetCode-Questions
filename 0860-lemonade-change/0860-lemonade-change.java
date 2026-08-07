class Solution {
    public boolean lemonadeChange(int[] nums) {
        int fiveCnt = 0;
        int tenCnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 5) {
                fiveCnt++;
            }
            else if(nums[i] == 10) {
                if(fiveCnt > 0){
                    fiveCnt--;
                    tenCnt++;
                } 
                else return false;
            }
            else {
                if(fiveCnt > 0 && tenCnt > 0) {
                    fiveCnt--;
                    tenCnt--;   
                }
                else if(fiveCnt >= 3) fiveCnt -= 3;
                else return false;
            }
        }
        return true;
    }
}