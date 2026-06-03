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
    public TreeNode construct(int preLow, int preHigh, int inLow, int inHigh, int[] preorder, int[] inorder){
        if(preLow > preHigh || inLow > inHigh) return null;
        TreeNode root = new TreeNode(preorder[preLow]);
        int mid = 0;
        for(int i = inLow; i <= inHigh; i++){
            if(inorder[i] == root.val){
                mid = i;
                break;
            }
        }
        int lst = mid - inLow;
        root.left = construct(preLow + 1, preLow + lst, inLow, mid - 1, preorder, inorder);
        root.right = construct(preLow + lst + 1, preHigh, mid + 1, inHigh, preorder, inorder);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return construct(0, n - 1, 0, n - 1, preorder, inorder);
    }
}