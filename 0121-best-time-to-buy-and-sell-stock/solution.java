class Solution {
    public int maxProfit(int[] prices) {
       int max_p =0 ;
       int buy_p = prices[0];
       int n = prices.length;
        for(int i:prices)
        {
            if(i<buy_p)
                buy_p=i;
            else
            max_p= Math.max(max_p,i-buy_p);
        }
        return max_p;
    }
}
