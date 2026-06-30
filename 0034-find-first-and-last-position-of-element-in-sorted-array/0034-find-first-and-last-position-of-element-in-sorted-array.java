class Solution {
    public int firstOcc(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        if(nums[ans] == target) return ans;
        else return -1;
    }
     public int lastOcc(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        if(nums[ans] == target) return ans;
        else return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] newArr = new int[2];
        if(nums.length == 0) {
            Arrays.fill(newArr, -1);
            return newArr;
        }
        newArr[0] = firstOcc(nums, target);
        newArr[1] = lastOcc(nums, target);
        return newArr;
    }
}