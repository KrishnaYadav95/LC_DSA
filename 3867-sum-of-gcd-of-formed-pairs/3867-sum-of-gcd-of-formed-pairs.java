class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixgcd = new int[nums.length];
        int mx = nums[0];
        prefixgcd[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
          mx = Math.max(mx, nums[i]);
         prefixgcd[i] = gcd(nums[i], mx);
        }
        Arrays.sort(prefixgcd);
        int left = 0, right = prefixgcd.length - 1;
        long sum=0;
        while (left < right) {
            sum += gcd(prefixgcd[left], prefixgcd[right]);
            left++;
            right--;
        }
        return sum;
    }

    int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna