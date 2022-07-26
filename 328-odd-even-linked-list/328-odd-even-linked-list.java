/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        
        ListNode odd = head;
        ListNode even = head.next, evenHead = head.next;
        
        while(even != null && even.next != null){
            odd = odd.next = even.next;
            even = even.next = odd.next;
        }
        odd.next = evenHead;
        
        return head;
    }
}