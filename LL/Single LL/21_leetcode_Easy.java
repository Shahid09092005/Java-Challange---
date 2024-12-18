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
        ListNode t1 =  list1;
        ListNode t2 = list2;
        ListNode main = new ListNode(23);
        ListNode temp = main;
        while(t1!=null && t2!=null){ // while breakdown if any reach to null
            if(t1.val<=t2.val){     // t1 smaller
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){ // t2 have some nodes so directly connect with t2
            temp.next = t2;
        }else{   // // t1  have some nodes so directly connect with t1
             temp.next = t1;
        }

        return main.next;
    }
}
