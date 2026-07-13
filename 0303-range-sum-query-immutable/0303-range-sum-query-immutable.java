class NumArray {
    int[] newArr;
    public NumArray(int[] nums) {
        newArr = new int[nums.length];
        newArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            newArr[i] = newArr[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return newArr[right];
        else return newArr[right] - newArr[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */