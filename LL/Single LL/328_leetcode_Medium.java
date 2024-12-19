class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd = head; // first node is odd
        ListNode even = head.next; // second node is even
        ListNode evenhead = even;
        while(even!=null && even.next!=null){
            // Odd
            odd.next = odd.next.next;
            odd = odd.next;
            // Even
            even.next = even.next.next;
            even = even.next;
        }
        odd.next=evenhead;
        return head;
    }
}
