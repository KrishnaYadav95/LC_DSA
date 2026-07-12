class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return ;
        int mid= (l+r)/2;
        mergeSort(arr, l , mid);
        mergeSort(arr , mid+1 , r);
        merge(arr, l , mid, r);
    }
    void merge(int[] arr , int l , int mid , int r){
        int[] temp= new int[r-l+1];
        int low=l;
        int high=mid+1;
        int idx=0;
        while(low<=mid && high<=r){
            if(arr[low]>=arr[high]){
                temp[idx++]= arr[high++];
            }else{
                temp[idx++]= arr[low++];
            }
        }
        while(low<=mid){
            temp[idx++]=arr[low++];
        }
        while(high<=r){
            temp[idx++]= arr[high++];
        }
        for(int i=l;i<=r;i++){
            arr[i]= temp[i-l];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna