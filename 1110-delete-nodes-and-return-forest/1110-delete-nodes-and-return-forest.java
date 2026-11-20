class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        if(root == null) return list;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < to_delete.length; i++) {
            set.add(to_delete[i]);
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        if(!set.contains(root.val)) {
            list.add(root);
        }

        while(!q.isEmpty()) {
            TreeNode curr = q.remove();
            if(curr.left != null) {
                q.add(curr.left);
                if(set.contains(curr.left.val)) {
                    curr.left = null;
                } 
                else if(set.contains(curr.val)){
                    list.add(curr.left);
                }
            }
            if(curr.right != null) {
                q.add(curr.right);
                if(set.contains(curr.right.val)) {
                    curr.right = null;
                } 
                else if(set.contains(curr.val)){
                    list.add(curr.right);
                }
            }
        }
        return list; 
    }
}