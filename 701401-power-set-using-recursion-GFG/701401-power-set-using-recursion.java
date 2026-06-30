class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        char []arr= new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]= s.charAt(i);
        }
        ArrayList<String> list= new ArrayList<>();
         ArrayList<Character> curr= new ArrayList<>();
        set(arr, list, 0 , curr);
        return list;
    }
    void set(char[] arr , ArrayList<String> list , int i , ArrayList<Character> curr){
       if(i>=arr.length){
          // list.add(arr);
          StringBuilder sb= new StringBuilder();
          for(char ch: curr){
              sb.append(ch);
          }
          list.add(sb.toString());
           return ;
       }
       //take it 
       curr.add(arr[i]);
       set(arr , list, i+1 , curr);
       curr.remove(curr.size()-1);
       // not take it
       set(arr, list , i+1 , curr);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna