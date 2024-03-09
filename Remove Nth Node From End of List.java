class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode t=null;
    ListNode  s=head;
    ListNode f=head;
    for(int i=0;i<n;i++){
        f=f.next;
    }
    while(f!=null){
        t=s;
        s=s.next;
        f=f.next;
        }
        if(t==null){
            return head.next;
        }if(t!=null){
            t.next=t.next.next;
        }
    return head;
    }
}
