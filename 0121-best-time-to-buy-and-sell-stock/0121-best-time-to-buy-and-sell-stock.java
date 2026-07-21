class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int profit = 0;
        int buyDay = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < buyDay){
                buyDay = arr[i];
            }
            else{
                profit = Math.max(arr[i] - buyDay, profit);
            }
        }
        return profit;
    }
}