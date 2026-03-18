class Solution {
    public void recurs(List<List<Integer>> ans, List<Integer> res, int n, int k, int idx){
        if(res.size() == k){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = idx; i <= n; i++){
            res.add(i);
            recurs(ans, res, n, k, i + 1);
            res.remove(res.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        recurs(ans, res, n, k, 1);
        return ans;
    }
}