
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0;
        ListNode temp1 = headA;
        while(temp1!=null){
            temp1=temp1.next;
            size1++;
        }
        int size2 = 0;
        ListNode temp2 = headB;
        while(temp2!=null){
            temp2=temp2.next;
            size2++;
        }
        
        // Reach at same no. of node
        if(size1>size2){
            for(int i=0;i<size1-size2;i++){
                temp1=temp1.next;
            }
        }else{
            for(int i=0;i<size2-size1;i++){
                temp2=temp2.next;
            }
        }
        // now check the intersection bewteen two linked list
        while(temp1.val!=temp2.val){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

        
    }
}
