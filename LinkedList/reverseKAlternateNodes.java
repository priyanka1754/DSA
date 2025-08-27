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

        boolean doReverse = true; // flip after every k nodes

        while(head!=null){
            k1--;
            if(k1==0){
                ListNode temp=head.next;
                head.next=null;

                if(doReverse){
                    // reverse this group
                    ListNode rev=reverse(revEle);
                    prevGroupTail.next=rev;
                    revEle.next=temp;
                    prevGroupTail=revEle;
                } else {
                    // skip this group, don't reverse
                    prevGroupTail=revEle;
                }

                revEle=temp;
                head=temp;
                k1=k;
                doReverse = !doReverse; // flip for next group
                continue;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
