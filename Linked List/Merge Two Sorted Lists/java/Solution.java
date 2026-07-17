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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sorted=new ListNode();
        ListNode n1=sorted;
        while(list1 !=null && list2!=null){
            if(list1.val<list2.val){
                n1.next=list1;
                list1=list1.next;
                //n1=n1.next;
            }
            else{
                n1.next=list2;
                list2=list2.next;
            }
            n1=n1.next;
        }
       if(list1!=null){
            n1.next=list1;
            //list1=list1.next;
        }
   else if(list2!=null){
            n1.next=list2;
           // list2=list2.next;
        }
        return sorted.next;
    }
}