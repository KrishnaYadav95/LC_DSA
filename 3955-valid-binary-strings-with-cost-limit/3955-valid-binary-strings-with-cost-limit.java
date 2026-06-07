class Solution {
    public List<String> generateValidStrings(int n, int k) {
        // suppose n=3 
        //  generate all 3 digit binary string ..
        // case 1 is the ahrd part;;                                                      
        int length=(int) Math.pow(2, n);
        ArrayList<String> binarystring = new ArrayList<>();
        for(int i=0;i<length; i++){
            String str = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0'); // FIX 1: pad to n digits
            binarystring.add(str);
        }
        // step2 -> check each String seperately 
        // if condition follows add them in a new list or simply remove them               from the same list;
ArrayList<String> Newbinarystring = new ArrayList<>();
        for(int i=0;i<binarystring.size();i++){
            String str=binarystring.get(i);
            if(validSum(str, k) && validConsecutive(str)) {
                Newbinarystring.add(str);
            }
        }
        return Newbinarystring;
    }
    boolean validSum(String str , int k){
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') sum+=i;
            if(sum>k) return false;
        }
        return true;
    }
    boolean validConsecutive(String str){
     for(int i=1; i<str.length();i++){
        
         if(str.charAt(i-1)=='1'&& str.charAt(i)=='1') return false;
     }
       return true; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna