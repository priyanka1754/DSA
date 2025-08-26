https://leetcode.com/problems/reverse-nodes-in-k-group/

25. Reverse Nodes in k-Group

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
    public ListNode reverse(ListNode head){
        ListNode rev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=rev;
            rev=head;
            head=temp;
        }
        return rev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int k1=k;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevGroupTail=dummy;
        ListNode revEle=head;
        while(head!=null){
            k1--;
            if(k1==0){
                ListNode temp=head.next;
                head.next=null;
                ListNode rev=reverse(revEle);
                prevGroupTail.next=rev;
                revEle.next=temp;
                prevGroupTail=revEle;
                revEle=temp;
                head=temp;
                k1=k;
                continue;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
