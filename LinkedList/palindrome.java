https://leetcode.com/problems/palindrome-linked-list/description/

234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        System.out.println(s);
        int n=s.length();
        for(int i=0;i<(n/2);i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
}


//Another Method without using extra space..
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

    public ListNode reverseList(ListNode head){
        ListNode rev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=rev;
            rev=head;
            head=temp;
        }
        return rev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalf=reverseList(slow);
        ListNode firstHalf=head;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val) return false;
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
}
