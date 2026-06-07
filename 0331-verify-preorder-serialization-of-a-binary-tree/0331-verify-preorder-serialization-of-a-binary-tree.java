class Solution {
    public boolean isValidSerialization(String preorder) {
         ArrayList<String> list= new ArrayList<>(Arrays.asList(preorder.split(",")));
        int i=0;
        int j=1;
        // 9 3 4 # # 1 # # 2 # 6 # # 
        // i j
        //   i j
        //     i j
        //       i j
        if(list.size() > 1 && list.get(0).equals("#")) return false;
        while(j<list.size()){
       if( i>0 && list.get(i).equals("#") && list.get(j).equals("#")){
        
        list.remove(j);
        list.remove(i);
        list.remove(i-1);
      
        list.add(i-1, "#");
        if(list.size() > 1 && list.get(0).equals("#")) return false;
        i=Math.max(0 ,i-2);
        j=i+1;
       }else{
        i++;
        j++;
       }
        }
        if(list.size()==1 && list.get(0).equals("#")) return true;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna