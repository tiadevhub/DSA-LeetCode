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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        ListNode prev=dummy;
        dummy.next=head;
        ListNode current=head;
        for(int i=1;i<left;i++){
            prev=current;
            current=current.next;
        }
        ListNode prev2=null;
        ListNode leftNode=current;
        for(int i=0;i<right-left+1;i++){
            ListNode front=current.next;
            current.next=prev2;
            prev2=current;
            current=front;
        }
        
            prev.next=prev2;

       
        leftNode.next=current;
        return dummy.next;
    }
}