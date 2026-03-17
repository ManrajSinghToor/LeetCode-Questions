class Solution {
    public void recurs(int[] arr, List<List<Integer>> ans, List<Integer> res, int idx){
        ans.add(new ArrayList<>(res));

        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i - 1]) continue;

            res.add(arr[i]);
            recurs(arr, ans, res, i + 1);
            res.remove(res.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        recurs(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
}