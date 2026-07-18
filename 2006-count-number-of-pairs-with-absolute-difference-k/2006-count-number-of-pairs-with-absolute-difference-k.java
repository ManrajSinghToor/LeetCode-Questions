class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)) map.put(ele, map.get(ele) + 1);
            else map.put(ele, 1);
        }
        int cnt = 0;
        for(int ele : map.keySet()){
            int need = ele - k;
            int need2 = ele + k;
            if(map.containsKey(need)) cnt += (map.get(ele) * map.get(need));
            if(map.containsKey(need2)) cnt += (map.get(ele) * map.get(need2));
        }
        cnt /= 2;
        return cnt;
    }
}