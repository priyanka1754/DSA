https://leetcode.com/problems/sort-list/

148. Sort List

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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=findMid(head,true);
        ListNode sh=mid.next;
        mid.next=null;
        return merge(sortList(head),sortList(sh));
    }

    public ListNode findMid(ListNode h,boolean flag){
        ListNode s=h,f=h;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f.next==null || flag==true){
            return s;
        }
        return s.next;
    }

    public ListNode merge(ListNode h1,ListNode h2){
        // ListNode h;
        // if(h1.val<=h2.val){
        //     h=h1;
        //     h1=h1.next;
        // }else{
        //     h=h2;
        //     h2=h2.next;
        // }
        ListNode h=new ListNode(-1);
        ListNode th=h;
        while(h1!=null && h2!=null){
            if(h1.val <= h2.val){
                h.next=h1;
                h1=h1.next;
            }else{
                h.next=h2;
                h2=h2.next;
            }
            h=h.next;
            // h.next=null;
        }
        if(h1!=null){
            h.next=h1;
        }
        if(h2!=null){
            h.next=h2;
        }
        return th.next;
    }
    
}
