public class Solution {
    public ListNode detectCycle(ListNode head) {
        // No cycle in an empty or single node list
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Detect if a cycle exists using two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {
                ListNode temp = head;

                // Find the start of the cycle
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp; // Starting node of the cycle
            }
        }

        // No cycle detected
        return null;
    }
}
