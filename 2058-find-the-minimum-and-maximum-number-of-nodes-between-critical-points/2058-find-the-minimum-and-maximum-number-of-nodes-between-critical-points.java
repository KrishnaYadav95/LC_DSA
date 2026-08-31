class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // check if number of nodes are above 3
        int count=0;
        List<Integer> list= new ArrayList<>();
        // make prev  curr and next pointer
        int idx=2;
        ListNode prev= head;
        ListNode curr= head.next;
        ListNode next= head.next.next;
        while(next!=null){
            if(isCondition(prev, curr , next)){
                list.add(idx);
            }
            prev= prev.next;
            curr= curr.next;
             next=next.next;
            idx++;
        }
        if(list.size()<2){
            return new int[] {-1, -1};
        }
         int minDiff = Integer.MAX_VALUE;
int maxDiff = list.get(list.size() - 1) - list.get(0);

for (int i = 1; i < list.size(); i++) {
    int diff = list.get(i) - list.get(i - 1);
    if (diff < minDiff) {
        minDiff = diff;
    }
}

        return new int[] {minDiff , maxDiff};
    }
    boolean isCondition(ListNode prev , ListNode curr , ListNode next){
        if((curr.val >prev.val && curr.val>next.val ) || (curr.val<prev.val && curr.val<next.val)){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna