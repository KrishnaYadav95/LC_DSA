class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans= new int[prices.length];
        for(int i=0; i<prices.length ;i++){
            for(int j=0;j<prices.length;j++){
                if( j>i && prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }else{
                    ans[i]=prices[i];
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna