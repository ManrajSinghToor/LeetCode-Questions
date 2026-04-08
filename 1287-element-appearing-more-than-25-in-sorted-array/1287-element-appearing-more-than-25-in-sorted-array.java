class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int ans = arr[0];
        for(int ele : map.keySet()){
            if(map.get(ele) > 0.25) {
                if(map.get(ans) < map.get(ele)) ans = ele;
            }
        }
        return ans;
    }
}