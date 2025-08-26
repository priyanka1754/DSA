https://leetcode.com/problems/reorder-list/

143. Reorder List

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

    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        ListNode rev=reverse(mid);
        ListNode first=head;
        ListNode second=rev;
        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
