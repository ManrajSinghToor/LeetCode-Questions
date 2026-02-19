class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < 32; i++){
            int bitSum = 0;
            for(int n : nums){
                if(((1 << i) & n) != 0){
                    bitSum += 1;
                }
            }
            if(bitSum % 3 != 0){
                num = num | (1 << i);
            }
        }
        return num;
    }
}