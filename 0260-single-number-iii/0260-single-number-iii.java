class Solution {
    public int[] singleNumber(int[] arr) {
        int[] ans = new int[2];
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor ^= arr[i];
        }
        int mask = ((xor & (xor - 1)) ^ xor);
        int bucket1 = 0;
        int bucket2 = 0;
        for(int i = 0; i < arr.length; i++){
            if((mask & arr[i]) == 0){
                bucket2 ^= arr[i];
            }
            else {
                bucket1 ^= arr[i];
            }
        }
        ans[0] = bucket1;
        ans[1] = bucket2;
        return ans;
    }
}