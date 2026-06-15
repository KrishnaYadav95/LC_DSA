/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null) return null;
        int lengthofll=0;
        ListNode temp= head;
        while(temp!=null){
            lengthofll+=1;
            temp=temp.next;
        }
        if(n==lengthofll) return head.next;
        int k = lengthofll-n;
        temp= head;
        while(k--!=1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna