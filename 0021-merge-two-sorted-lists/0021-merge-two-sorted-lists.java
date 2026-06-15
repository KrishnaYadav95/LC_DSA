class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null)
            return null;
        if (head1 == null && head2 != null)
            return head2;
        if (head1 != null && head2 == null)
            return head1;

        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode newhead = null;
        ListNode current = null; 

        if (temp1.val <= temp2.val) { 
            newhead = temp1;
            current = temp1;
            temp1 = temp1.next;
        } else {
            newhead = temp2;
            current = temp2;
            temp2 = temp2.next;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) { 
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next; 
        }

      
        if (temp1 != null) {
            current.next = temp1;
        } else {
            current.next = temp2;
        }

        return newhead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna