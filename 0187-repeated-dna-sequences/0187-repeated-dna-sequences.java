class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        int j = 0;
        while (j <= s.length() - 10) {
            String ans = s.substring(j, j + 10);

            if (set.contains(ans) && !list.contains(ans)) list.add(ans);
            set.add(ans);

            j++;
        }
        return list;
    }
}