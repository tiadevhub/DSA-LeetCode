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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        while(current!=null && current.next!=null){
            
            ListNode front=current.next;
            current.next=front.next;
            front.next=current;
            
            
            if(prev!=null){
                prev.next=front;
            }else{
                head=front;
            }
            prev=current;
            current=current.next;

        }

        return head;
        
    }
}