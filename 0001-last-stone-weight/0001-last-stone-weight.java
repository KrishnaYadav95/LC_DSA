class Solution {
    public int lastStoneWeight(int[] arr) {
     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
     for( int i=0; i<arr.length;i++){
        pq.add(arr[i]);
        }
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            int z = x - y;
            if(z>0) pq.add(z);
        }
        if(pq.size() == 1) return pq.peek();
        else return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna