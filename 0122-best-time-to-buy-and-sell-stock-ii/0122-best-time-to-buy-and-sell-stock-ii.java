class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int i=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]>=prices[i]){
                maxprofit+=prices[j]-prices[i];
            }
            i++;
        }
        return maxprofit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna