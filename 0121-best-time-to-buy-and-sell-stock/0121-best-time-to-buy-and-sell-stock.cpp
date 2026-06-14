class Solution {
public:
    int maxProfit(vector<int>& nums) {
          int minprices=nums[0];
        int profit=0;
        for(int i=1;i<nums.size();i++){
            if(nums[i]>minprices){
              profit = std::max(profit, nums[i] - minprices);
            }else{
                minprices=nums[i];
            }
        }
        return profit;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna