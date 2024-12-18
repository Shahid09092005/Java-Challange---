class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        if(head.next==null){ // only 1 element is present
            return head =head.next;
        }
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow at middle , now delete the slow node
        prev.next = slow.next;
        return head;
        
    }
}
