class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int units = 0;
        for (int a[] : boxTypes) {
            if (truckSize <= 0)
                break;
            int boxes = Math.min(truckSize, a[0]);
            units += a[1] * boxes;
            truckSize -= boxes;
        }
        return units;
    }
}