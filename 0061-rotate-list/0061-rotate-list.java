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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        // step1 count number of nodes in linekdlist
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        // step2 traverse to (count-k )th root and after reaching that root make a new variable to travrse that remaining part adn after reaching last node connect to head
        temp= head;
         k = k%count;
         if(k==0) return head;
        int steps= count-k;
        while(steps>1){
             steps--;
            temp=temp.next;
        
        }
        
        ListNode newhead= temp.next;
        ListNode newtemp=newhead;
        temp.next=null;
        while(newtemp.next!=null){
            newtemp=newtemp.next;
        }
        newtemp.next=head;
        return newhead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna