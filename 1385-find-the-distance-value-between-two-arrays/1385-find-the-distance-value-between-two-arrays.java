class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int x : arr1) {
            int low = 0, high = arr2.length - 1;
            boolean valid = true;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (Math.abs(x - arr2[mid]) <= d) {
                    valid = false;
                    break;
                }
                else if (arr2[mid] < x) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            if (valid) count++;
        }
        return count;
    }
}