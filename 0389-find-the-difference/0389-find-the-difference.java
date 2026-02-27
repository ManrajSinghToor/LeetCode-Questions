class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0, sum2 = 0;
        for(int ele : s.toCharArray()){
            sum += ele;
        }
        for(int ele : t.toCharArray()){
            sum2 += ele;
        }
        return (char) (sum2 - sum);
    }
}