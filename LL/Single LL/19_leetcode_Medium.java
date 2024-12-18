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
