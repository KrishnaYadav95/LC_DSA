class Solution {
    int count=0;
    public int inversionCount(int nums[]) {
        // code here
        mergesort(nums , 0 , nums.length-1);
        return count;
    }
    void mergesort(int[] nums , int left , int right){
        if(left>=right) return ;
        int mid= (left+right)/2;
        mergesort(nums , left , mid);
        mergesort(nums , mid+1 , right);
        merge(nums , left , mid , right);
    }
    void merge(int[] nums , int left , int mid , int right){
        int i=left;
        int j=mid+1;
        int[] temp= new int[right-left+1];
        int idx=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[idx++]=nums[i++];
            }else{
                count+=mid-i+1;
                temp[idx++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[idx++]=nums[i++];
        }
        while(j<=right){
            temp[idx++]=nums[j++];
        }
        for(int x=left ;x<=right;x++){
            nums[x]=temp[x-left];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna