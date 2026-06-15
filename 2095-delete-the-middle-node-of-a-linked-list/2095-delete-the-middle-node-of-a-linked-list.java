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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return null;
        int countlength=0;
        ListNode temp= head;
        while(temp!=null){
            countlength+=1;
            temp=temp.next;
        }
        int n=countlength/2;
        temp=head;
        while(n--!=1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna