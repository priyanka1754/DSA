https://leetcode.com/problems/rotate-list/submissions/1749208605/

61. Rotate List

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
        if(head==null || head.next==null) return head;
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }
        int noofRotations=k%length;
        if(noofRotations==0) return head;
        ListNode newTail=head;
        for(int i=0;i<length-noofRotations-1;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        tail.next=head;
        return newHead;
    }
}
