class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
     List<Integer> list= new ArrayList<>();
     List<List<Integer>> ans= new ArrayList<>();
     boolean[] flag = new boolean[10];
     combination(k , n ,1 , 0, list , ans , flag);
     return ans;   
    }
    void combination(int k , int n , int i , int sum , List<Integer> list, List<List<Integer>> ans, boolean[] flag){
        // Base case-1
        if(sum==n && list.size()==k){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(sum>n) return ;
        if(i>9) return ;

        //step1 pick it
      
        list.add(i);
        sum+=i;
        flag[i]=true;
        combination(k , n ,i+1,sum ,list, ans , flag);
        list.remove(list.size()-1);
        sum-=i;
      
      // skip it 
      combination(k , n , i+1 ,sum , list, ans, flag);
        }
    }
  


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna