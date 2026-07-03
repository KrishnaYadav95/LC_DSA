class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>  pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones) pq.add(i);

        while(pq.size()>1){
            int x= pq.remove();
            int y= pq.remove();
            int z= x-y;
            if(z>0) pq.add(z);
        }
        return pq.size()==0? 0 : pq.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna