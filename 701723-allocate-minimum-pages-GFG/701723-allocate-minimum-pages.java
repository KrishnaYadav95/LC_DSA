class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) return -1;
        int low=0;
        for(int i: arr){
            low=Math.max(low , i);
        }
        int high=0;
        for(int i:arr){
            high+=i;
        }
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid , arr , k)){
                high=mid-1;
                ans=Math.min(ans, mid);
            }else{
                low=mid+1;
            }
        }
        return low ;
    }
    boolean isPossible(int mid , int[] arr , int k){
        int sum=0;
        int cntbook=1;
        for(int i=0;i<arr.length;i++){

            if(sum+arr[i]>mid){
                cntbook++;
                sum=arr[i];
            }else{
              sum+=arr[i];
            }
        }
        return cntbook<=k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna