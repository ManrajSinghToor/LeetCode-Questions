class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // int cnt = 0;
        // for(int i = 0; i <= arr.length - k; i++){
        //     int sum = 0;
        //     for(int j = i; j < i + k; j++){
        //         sum += arr[j];
        //     }
        //     if((sum / k) >= threshold) cnt++;
        // }
        // return cnt;

        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while(j < arr.length){
            sum += arr[j];
            if(j - i + 1 == k){
                if(sum / k >= threshold) max++;
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}