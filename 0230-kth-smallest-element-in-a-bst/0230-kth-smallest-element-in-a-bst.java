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
    static int cnt;
    static int ans;
    public void inOrder(TreeNode root){
        if(root == null) return ;

        inOrder(root.left);
        cnt--;
        if(cnt == 0) ans = root.val;
        inOrder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
        cnt = k;
        inOrder(root);
        return ans;
    }
}