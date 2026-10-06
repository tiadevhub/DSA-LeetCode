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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int n=0;

        ListNode temp=head;
        ListNode tail=null;
        while(temp!=null){
            n++;
            tail=temp;
            temp=temp.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        temp=head;
        for(int i=1;i<n-k;i++){
            temp=temp.next;
        }
        ListNode newHead=temp.next;
        tail.next=head;
        temp.next=null;
        return newHead;

        
        
    }
}