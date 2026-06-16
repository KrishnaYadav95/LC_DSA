/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null|| head.next==null) return null;
        ListNode slow=head;
        ListNode fast= head;
        while(fast!=null){
            if(slow.next!=null)
            slow=slow.next;
         if(fast.next==null) return null;
            fast=fast.next.next;
            if(slow==fast) break;
        }
       ListNode temp= head;
       while(temp!=slow){
        temp=temp.next;
        if(slow.next==null) return null;
        slow=slow.next;
       }
       return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna