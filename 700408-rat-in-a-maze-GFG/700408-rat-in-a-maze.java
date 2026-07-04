class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> list= new ArrayList<>();
      //  String ans="";
        mazes(maze, 0 , 0 , list, "");
        Collections.sort(list);

        return list;
    }
    void mazes(int[][]maze , int row , int col , List<String> list , String ans){
        
        if(row<0 || row>=maze.length || col>=maze[0].length || col<0){
            return ;
        }
          if(maze[row][col]==0) return ;
          
        if(row==maze.length-1&&col==maze[0].length-1){
            list.add(ans);
            return ;
        }
        
      
        
        maze[row][col]=0;
      
        mazes(maze , row+1, col , list , ans+"D");
        mazes(maze , row-1 , col , list , ans+"U");
        mazes(maze, row , col+1 , list, ans+'R');
        mazes(maze , row, col-1 , list, ans+"L");
    maze[row][col]=1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna