class Solution {
    public int[] concatWithReverse(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        Collections.reverse(list);
        int[] ans = new int[nums.length * 2];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            ans[k++] = nums[i];
        }
        for(int i = 0; i < list.size(); i++){
            ans[k++] = list.get(i);
        }
        return ans;
    }
}