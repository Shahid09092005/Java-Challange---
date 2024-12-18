                                                                    // we can optimize bcz we cal. the size of ll then we are working on it to remove last n'th node
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int left = size-n;
        if(size==n){ // head of the linked list
            head=head.next;
            return head;
        }
        temp=head;
        for(int i=0;i<left-1;i++){ // -1 bcz we starting with 0. if start with 1 then no need to -1
            temp =temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
                                                                                  //Note: in 1 traversal

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) { // only 1 element is given
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

       
    }
}
