class Solution {
    public void sepDig(int n, List<Integer> ans){
        if(n == 0) return ;
        int ld = n % 10;
        sepDig(n / 10, ans);
        ans.add(ld);
    }
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            sepDig(nums[i], ans);
        }
        int n = ans.size();
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = ans.get(i);
        }
        return temp;
    }
}