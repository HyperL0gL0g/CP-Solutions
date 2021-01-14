
class Solution {
    
    public ListNode sortList(ListNode head) 
    {
     //first break into two
    //sort them  and merge;
        if(head==null || head.next==null)
            return head;
    ListNode prev =head ,slow =head , fast = head;
    while(fast!=null && fast.next!=null)
    {
        prev= slow;
        slow=slow.next;
        fast =fast.next.next;
    }
    prev.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1,l2);
    }
    private ListNode  merge(ListNode l1 ,ListNode l2)
    {
     ListNode t = new ListNode(-1);
        ListNode head =t;
        while(l1!=null  && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                t.next =  l1;
                l1=l1.next;
            }
             else
            {
                t.next = l2;
                l2=l2.next;
            }
            t=t.next;
        }
        if(l1!=null)
            t.next=l1;
        if(l2!=null)
            t.next = l2;
    
        return head.next;
    }
}