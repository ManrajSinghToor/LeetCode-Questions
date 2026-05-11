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
    int sum = 0;
    public void rootToLeafs(TreeNode root, int path){
        if(root == null) return;

        path = (path * 10 + root.val);
        if(root.left == null && root.right == null){
            sum += path;
            path /= 10;
        }
        rootToLeafs(root.left, path);
        rootToLeafs(root.right, path);
    }
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        rootToLeafs(root, 0);
        return sum;
    }
}