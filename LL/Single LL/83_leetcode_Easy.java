class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or has only one element, no duplicates
        if(head==null || head.next==null){
            return head;
        } 
        // we don't need dummy node bcz we want the first node 
        ListNode current = head; // pointer to head of the list
        while( current != null && current.next != null){
             // If current node's value is the same as the next node's value
            if(current.val == current.next.val){
                // skip the duplicate node and points to it's next node of the deleted node
                current.next = current.next.next;
            }else{
                // Move to the next node
                current=current.next;
            }
        }
        return head;
        
    }
}
