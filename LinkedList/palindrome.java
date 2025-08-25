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
