class Solution {
    public void backtrack(int[] arr, List<List<Integer>> ans, List<Integer> a, int idx){
        if(idx == arr.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(arr[idx]);
        backtrack(arr, ans, a, idx + 1);
        a.remove(a.size() - 1);
        backtrack(arr, ans, a, idx + 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        backtrack(nums, ans, a, 0);
        return ans;
    }
}