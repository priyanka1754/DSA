https://leetcode.com/problems/intersection-of-two-linked-lists/description/


160. Intersection of Two Linked Lists


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // for(ListNode t1=headA;t1!=null;t1=t1.next){
        //     for(ListNode t2=headB;t2!=null;t2=t2.next){
        //         if(t1==t2) return t1;
        //     }
        // }
        // return null;

        int l1=getLength(headA);
        int l2=getLength(headB);
        ListNode t1=headA;
        ListNode t2=headB;
        while(l1>l2){
            t1=t1.next;
            l1--;
        }
        while(l1<l2){
            t2=t2.next;
            l2--;
        }
        while(t1!=null && t2!=null && t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }

    public static int getLength(ListNode head){
        int l=0;
        while(head.next!=null){
            l++;
            head=head.next;
        }
        return l;
    }
}