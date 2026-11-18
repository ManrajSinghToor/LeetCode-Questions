class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
                list.add(curr.val);
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}