/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        int countA=0;
        int countB=0;
        
        while(tempA.next != null){
            countA++;
            tempA= tempA.next;
        }
        
        while(tempB.next != null){
            countB++;
            tempB= tempB.next;
        }
        
        if(tempA == tempB){
            tempA = countA > countB ? headA : headB;
            tempB = countA > countB ? headB : headA;
            int dif = Math.abs(countA - countB);
            
            while(dif-- != 0)
                tempA= tempA.next;
            
            while(tempA != tempB){
                tempB= tempB.next;
                tempA= tempA.next;
            }
            return tempA;
        }
        return null;
   
    }
}