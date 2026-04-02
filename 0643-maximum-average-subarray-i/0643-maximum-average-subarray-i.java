class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        double max1 = Integer.MIN_VALUE, sum = 0;
        while(j < n){
            sum += arr[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(sum > max1){
                    max1 = sum;
                }
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max1/k;
    }
}