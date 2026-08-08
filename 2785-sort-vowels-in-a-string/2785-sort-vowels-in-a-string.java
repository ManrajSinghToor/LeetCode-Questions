class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int vowels = 0;
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(c == 'a' || c == 'i' || c == 'e' || c == 'u' || c == 'o' 
            || c == 'A' || c == 'I' || c == 'E' || c == 'U' || c == 'O') {
                vowels++;
            }
        }
        char[] arr = new char[vowels];
        int idx = 0;
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(c == 'a' || c == 'i' || c == 'e' || c == 'u' || c == 'o' 
            || c == 'A' || c == 'I' || c == 'E' || c == 'U' || c == 'O') {
                arr[idx++] = c;
                sb.setCharAt(i, '#');
            }
        }
        Arrays.sort(arr);
        int k = 0;
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == '#'){
                sb.setCharAt(i, arr[k++]);
            }
        }
        return sb.toString();
    }
}