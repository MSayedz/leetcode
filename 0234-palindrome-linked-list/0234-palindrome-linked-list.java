/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        Stack<ListNode> stack = new Stack<>();
        while(fast != null && fast.next != null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast != null)
            slow = slow.next;
        
        ListNode cur;
        while(slow != null){
            cur = stack.pop();
            if(cur.val != slow.val)
                return false;
            slow = slow.next;
        }
        
        return stack.isEmpty();
    }
}