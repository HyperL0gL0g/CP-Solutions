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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode h1 =list1  , h2 = list1 ,h3 = list1;
        ListNode ans  = new ListNode(-1);
        ans.next =  list1;
       // ListNode p = ans;
        int idx = 0;
        
        while(idx!=a-1)
        {
            h1=h1.next;
            idx++;
        }
        
        idx=0;
        while(idx!=b)
        {
            h2=h2.next;
            idx++;
        }
        
        while(list2!=null)
        {
            h1.next=list2;
            list2=list2.next;
            h1=h1.next;
        }
        h1.next=list2;
        h1.next=h2.next;
        
    return ans.next;
        
        
    }
}