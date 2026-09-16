class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int min= prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            maxprofit= Math.max(maxprofit , cost);
            min= Math.min(min , prices[i]);
        }
        return maxprofit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna