
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
     
        ListNode A  = headA;
        ListNode B = headB;
        
        while(A!=B)
            
        {
            A= A==null ? headB : A.next;
            B= B==null ? headA : B.next;
            
        }
        return A;
         
        
    }
}