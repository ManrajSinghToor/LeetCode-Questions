class Solution {
    public void merge(int[] a, int[] b, int[] arr){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i < a.length){
            arr[k++] = a[i++];
        }
        while(j < b.length){
            arr[k++] = b[j++];
        }
    }
    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1) return;

        // int mid = n / 2;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int k = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = arr[k++];
        }
        for(int i = 0; i < b.length; i++){
            b[i] = arr[k++];
        }

        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
}