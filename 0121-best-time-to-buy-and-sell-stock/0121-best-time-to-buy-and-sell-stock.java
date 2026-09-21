class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int l = 0;
        int r = 1;
        while(l<r && r < prices.length){
            if(prices[r]<prices[l]){
                l=r;
                r++;
                continue;
            }

            maxi = Math.max(maxi , prices[r]-prices[l]);
            r++;
        }

        return maxi;
    }
}