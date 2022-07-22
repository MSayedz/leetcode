/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
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