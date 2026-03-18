class Solution {
    public void recurs(int n, int k, List<List<Integer>> ans, List<Integer> res, int idx, int sum){
        if(sum == n){
            if(res.size() == k){
                ans.add(new ArrayList<>(res));
                return;
            }
        }
        if(k > n || sum > n) return; 

        for(int i = idx; i <= 9; i++){
            res.add(i);
            recurs(n, k, ans, res, i + 1, sum + i);
            res.remove(res.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        recurs(n, k, ans, res, 1, 0);
        return ans;
    }
}