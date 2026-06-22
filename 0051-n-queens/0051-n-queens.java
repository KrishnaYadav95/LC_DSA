class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
          boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2 * n - 1];
        boolean[] rdiag = new boolean[2 * n - 1];
        List<List<String>> ans= new ArrayList<>();
        queens(board , 0 , cols, ndiag , rdiag , ans);
        return ans;
    }
    List<String> buildBoard(boolean[][] board){
        ArrayList<String> list= new ArrayList<>();
        for(int i=0;i<board.length  ;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<board[0].length; j++){
                if(board[i][j]) sb.append("Q");
                else sb.append(".");
            }
            list.add(sb.toString());
        }
        return list;
    }
    void queens(boolean[][] board , int row , boolean[] cols , boolean[] ndiag , boolean[] rdiag , List<List<String>> ans){
        if(row==board.length){
            ans.add(buildBoard(board));
            return;
        }
        for(int col=0;col<board.length;col++){
            if(cols[col]==false && ndiag[row+col]==false && rdiag[row-col+board.length-1]==false){
                board[row][col]=true;
                cols[col]=true;
                ndiag[ row+col]=true;
                rdiag[row-col+ board.length-1]=true;
            
            queens(board , row+1 , cols , ndiag , rdiag , ans);
            board[row][col]=false;
                cols[col]=false;
                ndiag[row+col]=false;
                rdiag[row-col+board.length-1]=false;
        }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna