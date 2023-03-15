/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = 0, y = 0;
            if (l1 != null){
                x = l1.val;
                l1 = l1.next;
            }            
            if (l2 != null){
                y = l2.val;
                l2 = l2.next;
            }
            
            int sum = carry + x + y;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next ;
        }
        return result.next;
    }
}