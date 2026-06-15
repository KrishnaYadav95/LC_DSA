/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headAlength=0;
        int headBlength=0;
        ListNode temp1= headA;
        ListNode temp2= headB;
        while(temp1!=null){
            headAlength++;
            temp1=temp1.next;
        }
            while(temp2!=null){
            headBlength++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        int diff=0;
        if(headAlength>headBlength){
            diff= headAlength-headBlength;
            while(diff--!=0){
                temp1=temp1.next;
            }
        }
        else{
            diff= headBlength-headAlength;
            while(diff--!=0){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1= temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna