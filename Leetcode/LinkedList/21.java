
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2==null)
        {
            return l1==null && l2!=null? l2 : l2==null && l1!=null? l1 : null;
        }
        if(l1.val<=l2.val)
            return help(l1,l2);
        
            return help(l2,l1);
    }
    
    private ListNode help(ListNode l1 ,ListNode l2)
    {
        ListNode head  = new ListNode(-1);
        ListNode t = head;
     while(l1!=null && l2!=null)
     {
         if(l1.val<=l2.val){
             head.next = new ListNode(l1.val);
             l1=l1.next;
         }
         else
         {
             head.next = new ListNode(l2.val);
             l2=l2.next;
         }
         head=head.next;
     }
        while(l1!=null)
        {
            head.next = new ListNode(l1.val);
            head=head.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            head.next = new ListNode(l2.val);
            head=head.next;
            l2=l2.next;
        }
        
        
        
        
        return t.next;
    }
    
}