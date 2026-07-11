class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while(j < arr.length){
            sum += arr[j];
            if((j - i + 1) == k){
                if(sum / k >= threshold){
                    max++;
                }
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}