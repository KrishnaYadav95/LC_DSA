class Solution {
    public int kthSmallest(int[][] matrix, int k) {
         int m= matrix.length;
      int n= matrix[0].length;
      int [] res= new int[m*n];
      int idx=0;
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            res[idx]=matrix[i][j];
            idx++;
        }
      }
      Arrays.sort(res);
      return res[k-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna