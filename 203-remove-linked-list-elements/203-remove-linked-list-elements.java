/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode res = dummy;
        while(dummy != null && dummy.next != null){
            if(dummy.next.val == val)
                dummy.next = dummy.next.next;
            else
                dummy = dummy.next;
        }
        
        return res.next;
    }
}