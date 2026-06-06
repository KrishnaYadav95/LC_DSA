class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i<=target[target.length-1];i++){
            list.add(i);
        }
        //list= (1 , 2 , 3)
         ArrayList<Integer> target2= new ArrayList<>();
         for(int i=0;i<target.length;i++){
            target2.add(target[i]);
         }
         // target2=(1 , 3)
        ArrayList<String> list2= new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            list2.add("Push");
            if(!target2.contains(list.get(i))) {
                list2.add("Pop");
            }
        }
        return list2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna