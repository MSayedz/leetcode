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
        
        if(head == null || head.next ==null)
            return head;
        
        ListNode cur = head;
        ListNode nextNode = null;
        
        while(head.next != null){
            nextNode = head.next; 
            head.next = nextNode.next;
            nextNode.next = cur;
            cur = nextNode;
        }
        return cur;
    }
}