class Solution {
    public int[] buildArr(String s, int n){
        int[] z = new int[n];
        int l = 0;
        int r = 0;
        for(int i = 1; i < n; i++){
            if(i <= r) z[i] = Math.min(r - i + 1, z[i - l]);
            while(i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])){
                z[i]++;
            }
            if(i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        return z;
    }
    public long sumScores(String s) {
        int n = s.length();
        int[] zArr = buildArr(s, n);

        int i = 0;
        long sum = 0;
        while(i < zArr.length) {
            if(zArr[i] > 0) sum += zArr[i];
            i++;
        }
        return sum + n;
    }
}