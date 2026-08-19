class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n= nums.length;
        long[] prefix= new long[n+1];

        for(int i=0;i<n;i++){
            prefix[i+1]= prefix[i]+nums[i];
        }
        Deque<Integer> deque= new LinkedList<>();
        int min= Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            while(!deque.isEmpty() && prefix[i]-prefix[deque.peekFirst()]>=k){
                min= Math.min(min, i-deque.pollFirst());
            }
            while(!deque.isEmpty() && prefix[i]<=prefix[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
        }
        return min==Integer.MAX_VALUE? -1 : min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna