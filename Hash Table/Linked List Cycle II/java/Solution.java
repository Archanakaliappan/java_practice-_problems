/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
public int findLen(ListNode slow,ListNode fast){
    ListNode temp=slow;
    temp=slow.next;
    int count=1;
    while(temp!=slow){
        temp=temp.next;
        count++;
    }
   // System.out.println(count);
    return count;
}


    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
       int len=0;
        while(fast!=null && fast.next!=null){
             fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
            len=findLen(slow,fast);
            break;
            }
           
        }

        if(fast!=slow) return null;
        if(head==null || head.next==null){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(len>0){
            f=f.next;
            len--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return f;
    }
}