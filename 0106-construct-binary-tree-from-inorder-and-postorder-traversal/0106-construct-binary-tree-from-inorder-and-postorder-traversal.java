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
    public TreeNode construct(int inLow, int inHigh, int postLow, int postHigh, int[] inorder, int[] postorder){
        if(inLow > inHigh || postLow > postHigh) return null;

        TreeNode root = new TreeNode(postorder[postHigh]);
        int mid = 0;
        for(int i = inLow; i <= inHigh; i++){
            if(root.val == inorder[i]) {
                mid = i;
                break;
            }
        }
        int rst = inHigh - mid;
        root.left = construct(inLow, mid - 1, postLow, postHigh - rst - 1, inorder, postorder);
        root.right = construct(mid + 1, inHigh, postHigh - rst, postHigh - 1, inorder, postorder);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return construct(0, n - 1, 0, n - 1, inorder, postorder);
    }
}