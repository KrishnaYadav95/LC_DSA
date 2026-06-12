class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timer=0;
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
       
            while( tickets[k]>0){
             int p = q.poll();
               tickets[p]--;
               timer++;
               if(tickets[p]>0)  q.offer(p);

            }
        
        return timer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna