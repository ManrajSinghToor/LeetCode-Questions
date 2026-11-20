class Solution {
    List<TreeNode> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    public TreeNode dfs(TreeNode root, boolean isRoot) {
        if(root == null) return null;

        boolean deleted = set.contains(root.val);
        if(isRoot && !deleted) {
            list.add(root);
        }
        root.left = dfs(root.left, deleted);
        root.right = dfs(root.right, deleted);
        if(deleted) return null;

        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i = 0; i < to_delete.length; i++) {
            set.add(to_delete[i]);
        }

        dfs(root, true);
        return list; 
    }
}