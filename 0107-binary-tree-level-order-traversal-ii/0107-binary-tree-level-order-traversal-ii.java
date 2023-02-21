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
    
//     List<List<Integer>> levels = new ArrayList<List<Integer>>();

//     public List<List<Integer>> levelOrderBottom(TreeNode root) {
//         if (root == null) return levels;
//         helper(root, 0);
//         Collections.reverse(levels);
//         return levels;
//     }
    
//     public void helper(TreeNode node, int level) {
//         // start the current level
//         if (levels.size() == level)
//             levels.add(new ArrayList<Integer>());

//          // append the current node value
//          levels.get(level).add(node.val);

//          // process child nodes for the next level
//          if (node.left != null)
//             helper(node.left, level + 1);
//          if (node.right != null)
//             helper(node.right, level + 1);
//     }
}