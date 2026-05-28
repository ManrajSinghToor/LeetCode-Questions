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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode n = q.remove();
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
                res.add(n.val);
            }
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < res.size(); i++){
                if(res.get(i) > max) max = res.get(i);
            }
            ans.add(max);
        }
        return ans;
    }
}