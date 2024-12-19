class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // if no node then return null
        if(head==null) return null;
        //HashSet to store the unique element(Node.data)
        HashSet<Integer> set = new HashSet<>();
        Node Dummy = new Node(100); // Dummy Node with value is 100
        Node prev = Dummy; // prev points ot Dummy 
        Dummy.next = head;  // Dummy next point to head
        Node curr = head; // use to iterave and check's next value
        while(curr!=null && ){ //curr.next!=null not bcz if only one have.
            if(set.contains(curr.data)){
                prev.next=curr.next;
            }else{
                set.add(curr.data);
               prev = prev.next; 
            }
            curr=curr.next;
        }
        return Dummy.next;
    }
}
