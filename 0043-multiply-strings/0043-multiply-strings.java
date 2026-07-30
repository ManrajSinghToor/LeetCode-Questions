class Solution {
    public String multiply(String nums1, String nums2) {
        if(nums1.equals("0") || nums2.equals("0")) return "0";

        int n = nums1.length();
        int m = nums2.length();

        int[] ans = new int[n+m];
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                int n1 = nums1.charAt(i) - '0';
                int n2 = nums2.charAt(j) - '0';
                int mul = n1 * n2;
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + ans[p2];
                ans[p2] = sum % 10;
                ans[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int ele : ans){
            if(!(sb.length() == 0 && ele == 0)) sb.append(ele);
        }
        return sb.toString();
    }
}