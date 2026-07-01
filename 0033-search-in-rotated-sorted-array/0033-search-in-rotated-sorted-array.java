class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && target != nums[0]) return -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] <= nums[right]){ //means right part is sorted..
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else { //means left part is sorted..
                 if(target < nums[mid] && target >= nums[left]){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}