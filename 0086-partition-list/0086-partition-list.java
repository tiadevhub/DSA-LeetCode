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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead=new ListNode(-1);
        ListNode smallTail=smallHead;
        ListNode largeHead=new ListNode(-1);
        ListNode largeTail=largeHead;
        ListNode current=head;
        while(current!=null){
            if(current.val<x){
                smallTail.next=current;
                smallTail=smallTail.next;
            }else{
                largeTail.next=current;
                largeTail=largeTail.next;
            }
            current=current.next;
        }
        smallTail.next=largeHead.next;
        largeTail.next=null;
        return smallHead.next;
        
        
    }
}