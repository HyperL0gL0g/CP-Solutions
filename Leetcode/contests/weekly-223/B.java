/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class B {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null)
            return null;
        int len = count(0,head);
        int p1=k,p2=len-k+1;
        int v1=0,v2=0;
        ListNode t1=head,t2=head;
        int c1=1,c2=1;
        while(c1!=p1)
        {
            c1++;
            t1=t1.next;

        }
        v1=t1.val;
        while(c2!=p2)
        {
            c2++;
            t2=t2.next;

        }
        v2=t2.val;
        ListNode h=head;
        int i=1,j=1;
        //   System.out.println(len+" "+v1+" "+v2);
        while(h!=null)
        {

            if(i==p1)
            {
                h.val=v2;
            }
            if(j==p2)
            {
                h.val=v1;
            }
            h=h.next;
            i++;
            j++;
        }
        return head;
    }
    private int count(int c,ListNode h)
    {
        while(h!=null)
        {
            c++;
            h=h.next;
        }
        return c;
    }
}*/