class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i += (2 * k)){
            int first = i;
            int second = Math.min(i + k - 1, arr.length - 1);
            while(first < second){
                char temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                first++;
                second--;
            }
        }
        return new String(arr);
    }
}