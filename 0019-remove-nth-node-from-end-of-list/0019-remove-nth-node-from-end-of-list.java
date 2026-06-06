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
       ListNode temp = head;
       ListNode temp2 = head;
       int count=0;
       
       while(temp!=null){
        temp=temp.next;
        count++;
       }
       if(count==1){
        head=null;
        return head;
       }else if(count==n){
        head=head.next;
        return head;
       }
       int idx= count-n;
       for(int i=0;i<idx-1;i++){
        temp2=temp2.next;
      
       }
       temp2.next=temp2.next.next;
      return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna