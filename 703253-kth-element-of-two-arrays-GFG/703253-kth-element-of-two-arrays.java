class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0;
        int j=0;
        ArrayList<Integer> list= new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                list.add(b[j]);
                j++;
            }else if(a[i]<b[j]){
                list.add(a[i]);
                i++;
            }else{
                list.add(a[i]);
                list.add(b[j]);
                i++;
                j++;
            }
        }
        while(i<a.length){
            list.add(a[i]);
            i++;
        }
        while(j<b.length){
            list.add(b[j]);
            j++;
        }
        return list.get(k-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna