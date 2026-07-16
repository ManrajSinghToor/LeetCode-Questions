class Solution {
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int[] prefix = new int[nums.length];
        long ans = 0;
        int mx = 0;
        
        for (int i = 0; i < nums.length; i++) {
            mx = Math.max(mx, nums[i]);
            prefix[i] = gcd(nums[i], mx);
        }

        Arrays.sort(prefix);
        int i = 0;
        int j = prefix.length - 1;
        while(i < j){
            int num = gcd(prefix[i], prefix[j]);
            ans += (long) num;
            i++;
            j--;
        }
        return ans;
    }
}