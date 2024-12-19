class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode Dummy = new ListNode(100); // Dummy node
        ListNode prev = Dummy; // point to dummy node
        Dummy.next = head; // dummy next point to  
        ListNode curr = head; // use to iterate and check it's next node is duplica
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
//here curr.next!=null bcz if ll is [1,1] then curr move to last 1 , secd. condition through an error if we remove this condition.
                while(curr.next!=null && curr.val ==curr.next.val){
                    curr= curr.next; // update utill get same of curr and it's next
                }
                prev.next = curr.next;  // skip the duplicate and change stru. of LL
            }else{
                prev = prev.next; // points to next 
            }
            curr= curr.next; // update the currect to next
        }
        return Dummy.next;
        
    }
}
