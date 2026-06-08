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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return null;
        }

        int dup = head.val;

        ListNode curr = head;
        ListNode temp = head.next;

        while(temp != null){

            if(dup == temp.val){
                temp = temp.next;
            } else {
                dup = temp.val;
                curr.next = temp;
                curr = temp;
                temp = temp.next;
            }
        }

        curr.next = null;

        return head;
    }
}