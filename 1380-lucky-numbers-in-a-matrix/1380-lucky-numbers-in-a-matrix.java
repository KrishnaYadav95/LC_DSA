class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
             int min= matrix[i][0];
            for(int j=0; j<m;j++){
               if(matrix[i][j] <min){
                min= matrix[i][j];
               }
            }
            list.add(min);
        }
        Collections.sort(list);
        List<Integer> list2= new ArrayList<>();
        list2.add(list.get(list.size()-1));
        return list2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna