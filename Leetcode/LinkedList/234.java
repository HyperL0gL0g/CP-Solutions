
class Solution {
    
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null)
            return true;
        ListNode slow = head, fast= head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        
       // reverse from slow till end
        ListNode rev = reversed(slow);
        while(rev!=null)
        {
         if(rev.val!=head.val)
             return false;
            rev=rev.next;
            head=head.next;
        }
        return true;
        
    }
    private ListNode reversed(ListNode node)
    {
    ListNode prev =null;
        ListNode curr =  node;
        while(curr!=null)
        {
            ListNode  t = curr.next;
            curr.next = prev;
            prev=curr;
            curr=t;
        }
        return prev;
    }
}