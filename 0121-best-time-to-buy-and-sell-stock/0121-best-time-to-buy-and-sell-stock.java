class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) {
            return 0 ;
        }
        int l = 0 ;
        int r = l+1 ;

        int maxProfit = 0;
        while(l<r && r < prices.length){
            if(prices[r] < prices[l]){
                l = r;
                r = l + 1;

            }else{
                maxProfit = Math.max(maxProfit , prices[r] - prices[l]);
                r++;
            }
        }

        return maxProfit ;

    }
}