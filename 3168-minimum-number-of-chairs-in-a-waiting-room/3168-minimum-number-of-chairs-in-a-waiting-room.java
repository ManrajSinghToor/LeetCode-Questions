class Solution {
    public int minimumChairs(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'E'){
                cnt++;
                max = Math.max(max, cnt);
            }
            else cnt--;
        }
        return max;
    }
}