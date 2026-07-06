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
    public boolean recurs(TreeNode root, int num){
        if(root == null) return true;
        if(root.val != num) return false;
        return recurs(root.left, num) && recurs(root.right, num);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int num = root.val;
        return recurs(root, num);
    }
}