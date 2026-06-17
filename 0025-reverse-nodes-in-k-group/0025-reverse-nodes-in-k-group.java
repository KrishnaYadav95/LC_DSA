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
    public ListNode reverseKGroup(ListNode head, int k) {
        // step 1 count the length of ll;
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode newHead=null;
        ListNode prevTail= null;
        while(count>=k){
            temp=head;
            ListNode temp2=head;
            ListNode temp3= head;
            for(int i=0;i<k-1;i++){
                temp2=temp2.next;
            }
            temp3=temp2.next;
            ListNode newnode= reverse(temp , temp2);
            if(prevTail==null) newHead=newnode;
            else {
                prevTail.next=newnode;
            }
            // temp is now tail of reversed group
            temp.next=temp3;
            prevTail=temp;
            head=temp3;
            count-=k;
        }
        return newHead;
    }
    ListNode reverse(ListNode head , ListNode tail){
        ListNode stop= tail.next;
        // why tail.next becoz we also have to reverse the tail node so we have to include that too
        ListNode curr= head;
        ListNode next= null;
        ListNode prev= null;
        while(curr!=stop){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna