class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[] column = new boolean[n];
        boolean[] ndiag= new boolean[2*n-1];
        boolean[] rdiag = new boolean[2*n-1];
        boolean[][] board = new boolean[n][n];

        List<List<String>> ans= new ArrayList<>();
        queen(column , 0 , rdiag , ndiag , board , ans);
        return ans;

    }

    List<String> constructBoard(boolean[][] board){
       List<String> list= new ArrayList<>();
       for(int i=0; i< board.length; i++){
        StringBuilder sb= new StringBuilder();
        for(int j=0;j<board[0].length ; j++){
            if(board[i][j]) sb.append("Q");
            else sb.append(".");
        }
        list.add(sb.toString());
       }
       return list;
    }

    void queen(boolean[] column , int row , boolean[] rdiag , boolean[] ndiag , boolean[][] board , List<List<String>> ans){
        if(row==board.length){
            ans.add( new ArrayList<>(constructBoard(board)));
            return ;
        }

        for(int col=0;col<board.length;col++){
            if(column[col]==false && rdiag[row-col+ board.length-1]==false && ndiag[row+col]==false){
                column[col]=true;
                rdiag[row-col+board.length-1]=true;
                ndiag[row+col]=true;
                board[row][col]=true;

                queen(column , row+1 , rdiag , ndiag , board, ans);

                column[col]=false;
                rdiag[row-col+board.length-1]=false;
                ndiag[row+col]=false;
                board[row][col]=false;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna