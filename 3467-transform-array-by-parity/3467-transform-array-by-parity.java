class Solution {
    public int[] transformArray(int[] arr) {
        int n = arr.length;   
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}