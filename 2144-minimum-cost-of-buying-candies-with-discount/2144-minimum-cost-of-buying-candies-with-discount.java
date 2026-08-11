class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int candy = 0;
        int cnt = 0;
        int i = cost.length - 1;
        while(i >= 0){
            cnt += cost[i];
            candy++;
            if(candy == 2){
                i--;
                candy = 0;
            }
            i--;
        }
        return cnt;
    }
}