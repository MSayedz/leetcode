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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null)
                return resList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode curNode = null;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> curList = new ArrayList<>();
            for(int i = 0;i<size;i++){
                curNode = queue.poll();
                curList.add(curNode.val);
                if(curNode.left != null)
                    queue.offer(curNode.left);
                if(curNode.right != null)
                    queue.offer(curNode.right);
            }
            resList.add(curList);
        }
        return resList;
    }
}