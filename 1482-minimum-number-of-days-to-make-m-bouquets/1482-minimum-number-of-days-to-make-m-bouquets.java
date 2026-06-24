class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k> bloomDay.length) return -1;

        int low = Integer.MAX_VALUE;
        int high= Integer.MIN_VALUE;
        for(int i: bloomDay){
            low=Math.min(low  , i);
        }
        for(int i: bloomDay){
            high= Math.max(high , i);
        }
        while(low<high){
            int mid= low+(high-low)/2;
            if(canPick(mid , bloomDay , m, k)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
   boolean canPick(int mid , int[] bloomDay , int m , int k){
    int adjacent = k;
    int bouques = m;
    int count = 0;

    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < bloomDay.length; i++){
        if(bloomDay[i] <= mid)
            list.add(i);
    }

    for(int i = 0; i < list.size(); i++){
        if(i == 0){
            count = 1;
        }
        else if(list.get(i) - list.get(i - 1) == 1){
            count++;
        }
        else{
            count = 1;
        }
        if(count == adjacent){
            bouques--;
            count = 0;   // flowers used in this bouquet
        }
    }

    return bouques <= 0;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna