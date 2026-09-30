class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        // Your code has a few issues. Let's break them down:
        // 1. The first loop builds a map of prefix sums, but you don't actually use it to find subarrays of sum K.
        // 2. In the second loop, map.getKey(i) is invalid - HashMap doesn't have getKey(). You can only check if a key exists or get its value.
        // 3. The variable count is never declared.
        //
        // HINT: The correct approach uses prefix sums:
        // - Maintain a running prefixSum as you iterate.
        // - Use a HashMap to store how many times each prefix sum has occurred so far.
        // - For each prefixSum, check if (prefixSum - k) exists in the map. If it does, that means there's a subarray ending at current index with sum k.
        // - Add the count of (prefixSum - k) to your result.
        // - Then increment the count of the current prefixSum in the map.
        //
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        //
        // Try rewriting with this approach. Start by initializing the map with {0: 1} to handle subarrays starting from index 0.
        // FIXED: The previous approach was flawed because it pre-computed all prefix sums first, losing the "ending at index i" context.
        // The correct O(n) algorithm requires a single pass:
        // 1. Initialize the map with {0: 1} to handle subarrays starting from index 0.
        // 2. Iterate through the array, maintaining a running prefixSum.
        // 3. At each step, check if (prefixSum - k) exists in the map. If yes, add its frequency to count.
        // 4. Update the map with the current prefixSum.
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: empty prefix sum occurs once
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            // If (prefixSum - k) is in the map, it means there are subarrays ending at i with sum k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            
            // Update the frequency of the current prefixSum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna