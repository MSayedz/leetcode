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
    int res;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        dfsMaxPathSum(root);
        return res;
    }
    
    public int dfsMaxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        int l = Math.max(0, dfsMaxPathSum(root.left));
        int r = Math.max(0, dfsMaxPathSum(root.right));
        res = Math.max(res, l+r+ root.val);
        
        return root.val + Math.max(r,l);
    }
}