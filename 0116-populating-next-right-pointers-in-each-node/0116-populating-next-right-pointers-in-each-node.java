/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root != null)
            queue.offer(root);
        
        while(!queue.isEmpty()){
            int qSize = queue.size();
            while(qSize-->0){
                Node temp = queue.poll();
                if(qSize >0)
                 temp.next = queue.peek();
                else
                 temp.next = null;
                if(temp.left != null)
                    queue.offer(temp.left);
                if(temp.right != null)
                    queue.offer(temp.right);
            }
        }
        return root;
    }
}