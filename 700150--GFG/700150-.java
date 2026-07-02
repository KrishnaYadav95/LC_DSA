class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return ;
        }
    int mid= (l+r)/2;
    mergeSort(arr , l, mid);
    mergeSort(arr , mid+1 , r);
    merge(arr, l, mid, r);
    }
    void merge(int [] arr , int low , int mid , int high){
       int[] temp = new int[high - low + 1];
        int left= low ; 
        int right= mid+1;
        int idx=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[idx++]=arr[left++];
            }else{
                temp[idx++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[idx++]=arr[left++];
        }
        while(right<=high){
            temp[idx++]=arr[right++];
        }
        for(int i=low; i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna