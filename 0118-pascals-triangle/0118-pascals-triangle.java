import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            
            List<Integer> row = new ArrayList<>();
            
            // Fill row with 1s initially
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            
            // Update middle values using previous row
            for (int j = 1; j < i; j++) {
                int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                row.set(j, val);
            }
            
            ans.add(row);
        }
        
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna