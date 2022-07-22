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
        if(head == null)
            return head;
        
        Stack<ListNode> stack = new Stack<ListNode>();
        
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        
        ListNode res = stack.pop();
        ListNode newHead = res;
        while(!stack.isEmpty()){
            newHead.next = stack.pop();
            newHead = newHead.next;
        }
        newHead.next = null;
        return res;
    }
}