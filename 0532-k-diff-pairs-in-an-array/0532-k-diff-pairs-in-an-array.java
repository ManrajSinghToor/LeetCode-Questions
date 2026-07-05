class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
        int cnt = 0;
        for(int ele : map.keySet()){
            if(k == 0){
                if(map.get(ele) > 1) cnt++;
            }
            else {
                if(map.containsKey(ele + k)) cnt++;
            }
        }
        return cnt;
    }
}