class Solution {
    public void backTrack(int[] nums, int idx, boolean[] visit, List<Integer> a, List<List<Integer>> ans){
        if(idx == nums.length) {
            ans.add(new ArrayList<>(a));
            return ;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1] && !visit[i-1]) continue;
            if(!visit[i]) {
                a.add(nums[i]);
                visit[i] = true;
                backTrack(nums, idx + 1, visit, a, ans);
                a.remove(a.size() - 1);
                visit[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];
        backTrack(nums, 0, visit, a, ans);
        return ans;
    }
}