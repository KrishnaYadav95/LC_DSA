class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;

        List<Integer> list= new ArrayList<>();

        int finalmin= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int min= matrix[i][0];

            for(int j=0; j<m;j++){
                if(matrix[i][j] < min){
                    min= matrix[i][j];
                }
            }

            finalmin = Math.max(finalmin, min);
        }

        list.add(finalmin);

        int finalmax=Integer.MAX_VALUE;

        for(int j=0;j<m;j++){
            int max=Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }

            finalmax= Math.min(finalmax, max);
        }

        list.add(finalmax);

        if(list.get(0).equals(list.get(1))){
            List<Integer> ans = new ArrayList<>();
            ans.add(list.get(0));
            return ans;
        }

        return new ArrayList<>();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna