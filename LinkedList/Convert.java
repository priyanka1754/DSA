https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

1290. Convert Binary Number in a Linked List to Integer

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
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head.next!=null){
            s+=head.val;
        }
        int ans=Integer.toBinaryString(s);
        return ans;
    }
}
