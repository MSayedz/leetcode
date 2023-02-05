/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) 
            return head;
        
        return copyNode(head,new HashMap<Node, Node>()); 
    }
    
    private Node copyNode(Node head,Map<Node, Node> nodesMap){
        if(head  == null) 
            return null;
        if(nodesMap.containsKey(head))
            return nodesMap.get(head);
        
        Node copiedNode = new Node(head.val);
        nodesMap.put(head, copiedNode);
        
        copiedNode.next = copyNode(head.next, nodesMap);
        copiedNode.random = copyNode(head.random, nodesMap);
        
        return copiedNode;
    }
}