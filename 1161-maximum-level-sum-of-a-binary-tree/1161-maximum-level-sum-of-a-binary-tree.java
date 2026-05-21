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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int level = 1;
        int ansLevel = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int maxSum = 0;
            for(int i = 0; i < size; i++){
                TreeNode n = q.remove();
                maxSum += n.val;
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            if(maxSum > max) {
                max = maxSum;
                ansLevel = level;
            }
            level++;
        }
        return ansLevel;
    }
}