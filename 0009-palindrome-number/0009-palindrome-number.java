class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int rev = 0;
        int original = x;
        while(x > 0){
            int ld = x % 10;
            x /= 10;
            rev = rev*10 + ld;
        }
        if(original == rev){
            flag = true;
        }
        return flag;
    }
}