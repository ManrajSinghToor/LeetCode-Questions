class Solution {
    public int[] buildArr(String s, int n){
        int[] z = new int[n];
        int l = 0;
        int r = 0;
        for(int i = 1; i < n; i++){
            if(i <= r){
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while(i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if(i + z[i] - 1 > r){
                l = i;
                r = i + z[i] - 1;
            }
        }
        return z;
    }
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        String original = word;
        int[] z = buildArr(word, n);
        
        for(int i = 1; i * k < n; i++) {
            int removed = i * k;
            if(z[removed] >= n - removed) {
                return i;
            }
        }
        return (n + k - 1) / k;
    }
}