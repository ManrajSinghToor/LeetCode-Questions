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
    public void convertToList(TreeNode root, List<Integer> ans){
        if(root == null) return ;

        ans.add(root.val);
        convertToList(root.left, ans);
        convertToList(root.right, ans);
    }
    public void convertToLL(TreeNode root, List<Integer> ans, int idx){
        if(idx == ans.size()) return ;

        root.left = null;
        root.right = new TreeNode(ans.get(idx));
        convertToLL(root.right, ans, idx + 1);
    }
    public void flatten(TreeNode root) {
        if(root == null) return ;
        
        List<Integer> ans = new ArrayList<>();
        convertToList(root, ans);
        convertToLL(root, ans, 1);
    }
}