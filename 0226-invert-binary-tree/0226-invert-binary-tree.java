/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) 
            return null;
        TreeNode right = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = right;
        return root;
    }
}