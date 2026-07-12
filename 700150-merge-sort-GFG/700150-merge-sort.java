class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        // lets solve this 
        // step-> divide array in two parts low to mid , mid+1 to high
        // step->2 merge them
        // base caes if(l>r0 return ;
        if(l>=r) return ;
        int mid= (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid , r);
    }
    void merge(int[] arr, int low , int mid , int high){
        
        // we have a new array to store sorted vakue then copy them back to arr..
        int[] temp= new int[high-low+1];
        int left= low; 
        int right=mid+1;
        int idx=0;
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                temp[idx++]=arr[right++];
            }else if(arr[left]<arr[high]){
                temp[idx++]= arr[left++];
            }
        }
        while(left<=mid){
            temp[idx++]= arr[left++];
        }
        while(right<=high){
            temp[idx++]=arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna