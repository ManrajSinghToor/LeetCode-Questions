class Solution {
    private int binarySearch(MountainArray arr, int target, int left, int right, boolean asc) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == target) return mid;

            if (asc) {
                if (arr.get(mid) < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (arr.get(mid) > target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
                left = mid + 1;
            else
                right = mid;
        }

        int peak = left;

        int ans = binarySearch(mountainArr, target, 0, peak, true);

        if (ans != -1) return ans;

        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
}