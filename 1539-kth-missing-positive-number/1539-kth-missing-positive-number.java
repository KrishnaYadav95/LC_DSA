class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<=k) k++;
            else break;
        }
        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna