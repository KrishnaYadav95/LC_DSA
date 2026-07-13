class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
      List<Integer> list= new ArrayList<>();
        for (int start = 1; start <= 9; start++) {
            generate(low, high, list, start ,0);
        }
      Collections.sort(list);
      return list;
    }
    void generate(int low , int high , List<Integer> list , int i , int num){

        if(i>9) return ;

         num= num*10 + i;

        if(num>=low && num<=high){
            list.add(num);
           
        }
       
        generate(low , high , list ,i+1, num);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna