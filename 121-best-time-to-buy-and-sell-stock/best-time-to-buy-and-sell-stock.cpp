class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxi = 0;
        int n = prices.size();
        if(n<2){
            return maxi;
        }
        int l = 0;
        int r  = 1;
        while(r<n){
            if(prices[r]<prices[l]){
                l = r;
                r++;
                continue;
            }else{
                maxi = max(maxi , prices[r]-prices[l]);
                r++;
            }
        }
        return maxi;
    }
};