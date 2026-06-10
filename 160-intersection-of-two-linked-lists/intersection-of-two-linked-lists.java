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

    //optimql appocjdf -  use 2 temp and run them when one reaches the even chnage the head to another one. 
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=t2){
            if(t1==null)
                t1=headB;
            else
                t1=t1.next;    

            if(t2==null)
                t2=headA;
            else
                t2=t2.next;        
        }
        return t1;
    }
}