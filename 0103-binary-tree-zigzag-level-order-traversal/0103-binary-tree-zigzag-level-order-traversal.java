/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recurs(TreeNode root, List<List<Integer>> ans) {
        // if(root == null) return ;
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode n = q.remove();
                res.add(n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            if(level % 2 != 0) Collections.reverse(res);
            ans.add(res);
            level++;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        recurs(root, ans);
        return ans;
    }
}