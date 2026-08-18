class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int units = 0;
        for(int a[] : boxTypes) {
            if(truckSize <= 0) break;
            int boxes = a[0];
            if(boxes > truckSize) {
                units += truckSize * a[1];
                truckSize = 0;
            }
            else {
                units += a[0] * a[1];
                truckSize -= a[0];
            }
        }
        return units;
    }
}