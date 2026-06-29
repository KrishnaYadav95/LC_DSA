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
    public int pairSum(ListNode head) {
        // This solution stores all node values in an ArrayList and then uses a two-pointer approach.
        // Time Complexity: O(N) where N is the number of nodes (one pass to collect values + one pass to compute sums).
        // Space Complexity: O(N) due to the extra list storing node values.
      
        ArrayList<Integer> list= new ArrayList<>();
        ListNode temp= head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=list.size()-1;
        int sum=0;
        int maxsum=0;
        while(i<j){
            sum=list.get(i)+list.get(j);
            maxsum=Math.max(maxsum , sum);
            i++;
            j--;
        }
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna