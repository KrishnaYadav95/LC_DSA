import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";

        while (l1 != null) {
            s1 += l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            s2 += l2.val;
            l2 = l2.next;
        }
//342
//465

//708
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();

        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);
        BigInteger sum = n1.add(n2);

        String rev = new StringBuilder(String.valueOf(sum)).reverse().toString();

        ListNode root = new ListNode(0);
        ListNode dummy = root;
        for (int i = 0; i < rev.length(); i++) {
            dummy.next = new ListNode(rev.charAt(i) - '0');
            dummy = dummy.next;
        }
        return root.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna