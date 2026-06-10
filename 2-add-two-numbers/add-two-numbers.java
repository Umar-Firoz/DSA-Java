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
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   ListNode a = l1;
    ListNode b = l2;
    ListNode dummy = new ListNode();
    ListNode tail = dummy;
    int carry = 0;
    while(a != null || b != null){
        int x = (a != null) ? a.val : 0;
        int y = (b != null) ? b.val : 0;
      int sum = x + y + carry;
        if(sum >= 10){
          carry = 1;
          sum -= 10;
        } else {
            carry = 0;
        }
        tail.next = new ListNode(sum);
        tail = tail.next;
        if(a != null){
            a = a.next;
        }
        if(b != null){

            b = b.next;

        }

    }

    if(carry == 1){

        tail.next = new ListNode(1);

    }

    return dummy.next;

}
    
 }
    // //reverse
    // public ListNode reverseList(ListNode head) {
    //      ListNode prev=null;
    //      ListNode curr=head;
         
    //      while(curr!=null){
    //         ListNode next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //         if(next!=null){
    //             next=next.next;
    //         }
    //      }
    //      return prev;
    // }
