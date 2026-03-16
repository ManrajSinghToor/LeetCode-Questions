class Solution {
    public void recurs(int[] arr, List<List<Integer>> ans, List<Integer> res, int idx){
        if(idx == arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[idx]);
        recurs(arr, ans, res, idx + 1);
        res.remove(res.size() - 1);
        recurs(arr, ans, res, idx + 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        recurs(nums, ans, res, 0);
        return ans;
    }
}