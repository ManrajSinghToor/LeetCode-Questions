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
    public int levels(TreeNode root){
        if(root == null) return 0;
        int left = levels(root.left);
        int right = levels(root.right);

        return 1 + Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels - rightLevels) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}