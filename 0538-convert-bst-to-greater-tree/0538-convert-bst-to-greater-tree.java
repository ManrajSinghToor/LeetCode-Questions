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
    static int sum;
    public void bstToGst(TreeNode root){
        if(root == null) return ;

        bstToGst(root.right);
        int val = root.val;
        sum += val;
        root.val = sum;

        bstToGst(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        bstToGst(root);
        return root;
    }
}