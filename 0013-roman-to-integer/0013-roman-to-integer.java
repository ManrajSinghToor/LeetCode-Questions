class Solution {
    public int val(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if((i + 1 < n) && val(ch) < val(s.charAt(i+1))){
                ans -= val(ch);
            }
            else{
                ans += val(ch);
            }
        }
        return ans;
    }
}