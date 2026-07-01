/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while(left < right){
            int mid = left + (right - left) / 2;
            boolean vers = isBadVersion(mid);
            if(vers) right = mid;
            else left = mid + 1;
        }
        if(left != 0) return left;
        else return -1;
    }
}