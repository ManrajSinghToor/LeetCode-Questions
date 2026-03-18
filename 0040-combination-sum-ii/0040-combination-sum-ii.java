class Solution {
    public void recurs(int[] arr, List<List<Integer>> ans, List<Integer> res, int idx, int sum, int target){
        if(sum == target){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(sum > target) return;

        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i - 1]) continue;
            res.add(arr[i]);
            recurs(arr, ans, res, i + 1, sum + arr[i], target);
            res.remove(res.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Arrays.sort(candidates);
        recurs(candidates, ans, res, 0, 0, target);
        return ans;
    }
}