class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<matrix.length ; i++){
        for(int j=0 ; j<matrix[0].length ; j++ ){
        set.add(matrix[i][j]);
       }
       }
       if(set.contains(target)) return true;
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna