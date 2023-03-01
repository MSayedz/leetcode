/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // Stack<ListNode> stack = new Stack<>();
        // while(head != null){
        //     stack.push(head);
        //     head = head.next;
        // }
        // ListNode res = new ListNode(0);
        // head = res;
        // while(!stack.isEmpty()){
        //     head.next = stack.pop();
        //     head = head.next;
        // }
        // head.next = null;
        // return res.next;
        
        /* iterative solution */
        ListNode nextNode = null;
        ListNode prevNode = null;
        
        while(head != null){
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        
        return prevNode;
    }
}