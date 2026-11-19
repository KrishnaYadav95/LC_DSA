class Solution {
    public int minimizeSum(int[] nums) {
        // find the maximum , second max , thrid max
        // 5 7 8 
        // 1 4 5

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2){
                max3=max2;
                max2 = nums[i];
            }
            else if (nums[i] > max3)
                max3 = nums[i];
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = nums[i];
            }   else if(nums[i]<min2) {
                min3=min2;
                min2=nums[i];
            }
            else if (nums[i] < min3)
                min3 = nums[i];
        }
        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

        return Math.min(max3 - min1, Math.min(max2 - min2, max1 - min3));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna