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
        if(headA == headB)
            return headA;
        ListNode tempA = headA,tempB=headB;
        int lA = 0,lB=0;
        
        while(tempA != null){
            lA++;
            tempA = tempA.next;
        }
        while(tempB != null){
            lB++;
            tempB = tempB.next;
        }
        
        tempA = headA;
        tempB = headB;
        int diff = lA > lB ? lA-lB : lB-lA;
        
        if(lA > lB)
            for(int i=0;i<diff;i++)
                tempA = tempA.next;
        else
            for(int i=0;i<diff;i++)
                tempB = tempB.next;
        
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return tempA;
   
    }
}