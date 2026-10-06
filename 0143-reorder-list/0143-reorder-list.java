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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }   
        ListNode prev=null;
        ListNode current=slow.next;
        slow.next=null;
        while(current!=null){
            ListNode front=current.next;
            current.next=prev;
            prev=current;
            current=front;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode firstNext=first.next;
            ListNode secondNext=second.next;

            first.next=second;
            second.next=firstNext;

            first=firstNext;
            second=secondNext;

        }

    }
}