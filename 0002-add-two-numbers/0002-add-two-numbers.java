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
        int newValue = 0;
        while (l1 != null || l2 != null || carry != 0){
            if(l1 == null && l2 == null ){
               newValue = carry;
            } else if(l1 == null){
                newValue = l2.val +carry;   
                l2 = l2.next;
            } else if(l2 == null){
                newValue = l1.val +carry;                 
                l1 = l1.next;
            } else{
                 newValue = l1.val + l2.val + carry;
                 l1 = l1.next;
                 l2 = l2.next;  
            }
            carry = 0;
            if(newValue > 9){
                newValue = newValue % 10;
                carry = 1;
            } 
            temp.next = new ListNode(newValue);
            temp = temp.next ;
        }
        return result.next;
    }
}