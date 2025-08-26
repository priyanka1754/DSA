https://leetcode.com/problems/reverse-linked-list-ii/description/

92. Reverse Linked List II

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

    public static ListNode reverse(ListNode head){
        ListNode rev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=rev;
            rev=head;
            head=temp;
        }
        return rev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        
        ListNode beforeLeft=prev;
        ListNode start=prev.next;

        ListNode end=start;
        for(int i=left;i<right;i++){
            end=end.next;
        }
        ListNode afterRight=end.next;
        end.next=null;
        ListNode rev=reverse(start);
        beforeLeft.next=rev;
        start.next=afterRight;
        return dummy.next;
    }
}
