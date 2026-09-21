class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int l =0 ;
        int r = 1;
        if(prices.length < 2){
            return 0;
        }

        if(prices[r]<prices[l]){
            l = r ;
            r++;
        }
        int flag = 0;
        while(l<r && r < prices.length){
            if(prices[r] < prices[r-1]){
                profit+= (prices[r-1]-prices[l]);
                l = r;
                r = l + 1;
                flag = 0;
            }else{
                r++;
                flag = 1;
            }
        }

        if(r== prices.length && flag == 1){
            profit+= (prices[r-1]-prices[l]);
        };

        return profit;
    }
}