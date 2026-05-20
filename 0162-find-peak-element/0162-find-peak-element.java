class Solution {
    public int findPeakElement(int[] arr) {
        // if(arr.length <= 2) return 0;
        int i = 0, j = arr.length - 1;
        while(i < j){
            int mid = i + (j - i) / 2;
            if(arr[mid] < arr[mid + 1]) i = mid + 1;
            else j = mid;
        }
        return i;
    }
}