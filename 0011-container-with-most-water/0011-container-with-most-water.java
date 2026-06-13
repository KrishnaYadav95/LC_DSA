class Solution {
    public int maxArea(int[] height) {
     int i=0;
        int j=height.length-1;
        int k=0;
        int max=0;
        while(i<j){
  if(height[i]>height[j]) k=height[j];
            else k= height[i];
            max= Math.max(max, (j-i)*k);
           if(height[i]>height[j])j--;
            else i++;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna