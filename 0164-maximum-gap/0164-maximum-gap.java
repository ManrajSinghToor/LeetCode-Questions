class Solution {
    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n == 1) return ;

        int[] arr = new int[n / 2];
        int[] brr = new int[n - n / 2];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = nums[idx++]; 
        }
        for(int i = 0; i < brr.length; i++){
            brr[i] = nums[idx++]; 
        }

        mergeSort(arr);
        mergeSort(brr);

        merge(arr, brr, nums);
    }
    public void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
    public int maximumGap(int[] nums) {
        int maxdiff = 0;
        mergeSort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            int diff = nums[i + 1] - nums[i];
            maxdiff = Math.max(maxdiff, diff);
        }
        return maxdiff;
    }
}