class Solution {
    public String reverseWords(String s) {
        String trimed = s.trim();
        String[] arr = trimed.split("\\s+");
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}