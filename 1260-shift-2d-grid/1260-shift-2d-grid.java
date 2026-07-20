class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k=k% (grid.length*grid[0].length);
        List<Integer> list= new ArrayList<>();
        //step1 collect the grid element in a list
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        // step2-> reverse the grid
        Collections.reverse(list);
        // step3-> reverse first k element
        reverse(list, 0 , k-1);
        reverse(list, k, list.size()-1);
        int idx=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=list.get(idx++);
        }
        }
   List<List<Integer>> result = new ArrayList<>();
for (int i = 0; i < grid.length; i++) {
    List<Integer> rowList = new ArrayList<>();
    for (int j = 0; j < grid[0].length; j++) {
        rowList.add(grid[i][j]);
    }
    result.add(rowList);
}
return result;
    }
    void reverse(List<Integer> list , int start, int end){
    while(start<=end){
        int temp= list.get(start);
        list.set(start,list.get(end));
        list.set(end, temp);
        start++;
        end--;
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna