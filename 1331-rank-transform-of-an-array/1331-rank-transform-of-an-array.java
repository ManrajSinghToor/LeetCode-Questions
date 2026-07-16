class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[i];
        }
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], rank);
                rank += 1;
            }   
        }
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = map.get(ans[i]);
        }
        return ans;
    }
}