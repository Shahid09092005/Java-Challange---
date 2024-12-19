class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size =0;
        ListNode temp = head;
        // cal. size of Linked-List
        while(temp!=null){
            size++;
            temp =  temp.next;
        }

         // Initialize the result array
        ListNode[] store = new ListNode[k]; // (all null initially).

        temp = head ; // reset temp to head 
        int avg = size/k; // min. no. of element array contains in each list
        int extra = size%k; // no. of extra elements to be distributed
        for(int i=0;i<k;i++){
            if(temp==null) break ; // if there are less no. of nodes with k
            ListNode tempHead = temp;
            ListNode prev = null;
            int len=0;
            while(temp!=null && len<avg){
                len++;
                prev = temp;
                temp = temp.next;
            } // end while loop
            if(extra>0){
                prev = temp;
                temp = temp.next;
                extra--;
            } // end if loop
            prev.next = null;
            store[i] = tempHead;
        } // end for loop
        return store;
    }
}
