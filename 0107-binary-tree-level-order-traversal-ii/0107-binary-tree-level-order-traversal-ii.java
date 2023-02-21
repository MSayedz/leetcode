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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> cur = new ArrayList<>();
            for(int i=0;i<size;i++){
                root = queue.poll();
                cur.add(root.val);
                if(root.left != null)
                    queue.offer(root.left);
                if(root.right != null)
                    queue.offer(root.right);
            }
            
            res.add(cur);
        }
        
        Collections.reverse(res);
        
        return res;
    }
}