https://leetcode.com/problems/linked-list-cycle-ii/description/

142. Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode p1=head;
        ListNode p2=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                p2=fast;
                break;
            }
        }
        while(p1!=null && p2!=null){
            if(p1==p2) return p1;
            p1=p1.next;
            p2=p2.next;
        }
        return null;
        // if(p2==null) return null;
        // while(p1!=p2){
        //     p1=p1.next;
        //     p2=p2.next;
        // }
        // return p1;
    }
}
