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
    public int level(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levels = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode n = q.remove();
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            levels++;
        }
        return levels;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftLevels = level(root.left);
        int rightLevels = level(root.right);

        if(Math.abs(leftLevels - rightLevels) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}