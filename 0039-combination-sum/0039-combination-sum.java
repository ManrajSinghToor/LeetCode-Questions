class Solution {
    public void recurs(int[] arr, List<List<Integer>> ans, List<Integer> res, int idx, int sum, int k){
        if(sum == k){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(idx == arr.length || sum > k) return;
        res.add(arr[idx]);
        recurs(arr, ans, res, idx, sum + arr[idx], k);
        res.remove(res.size() - 1);
        recurs(arr, ans, res, idx + 1, sum, k);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        recurs(candidates, ans, new ArrayList<>(), 0, 0, target);
        return ans;
    }
}