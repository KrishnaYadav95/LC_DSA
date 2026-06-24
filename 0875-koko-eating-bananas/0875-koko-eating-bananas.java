class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // so high will be the sum of all bananas 
        int high = 0;
        for (int i : piles)
            high = Math.max(i, high);

        int low = 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canEat(mid, piles, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    boolean canEat(int mid , int[] piles , int h){
            int time=0;
            for(int i=0;i<piles.length;i++){
              time +=(int) Math.ceil((double) piles[i] / mid);
            }
            return time<=h;
        }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna