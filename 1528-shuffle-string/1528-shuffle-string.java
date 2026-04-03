class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}