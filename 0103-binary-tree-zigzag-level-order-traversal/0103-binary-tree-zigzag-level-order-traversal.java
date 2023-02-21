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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        boolean queueFlag = false;
        
        deque.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        while(!deque.isEmpty()){
            int size = deque.size();
            queueFlag = !queueFlag;
            List<Integer> cur = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                root = deque.poll();
                cur.add(root.val);                
                
                if(root.left != null)
                    deque.offer(root.left);
                if(root.right != null)
                    deque.offer(root.right);
            }
            
            if(!queueFlag) 
                Collections.reverse(cur); 
            res.add(cur);
        }
        return res;
    }
}