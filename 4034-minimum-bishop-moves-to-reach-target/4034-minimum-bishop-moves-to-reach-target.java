class Solution {
    public int minBishopMoves(int[] source, int[] target) {
       int sx= source[0] , sy=source[1];
       int tx= target[0] , ty=target[1];
       if((sx+sy)%2!= (tx+ty)%2 ) return -1;
       if(sx+sy == tx+ ty) return 1;
       if(sx-sy== tx-ty) return 1;
       return 2;
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna