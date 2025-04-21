class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int p =0;
        for(int i : prices){
            if(i<buy)
                buy = i ;
            p = Math.max(p,(i-buy));
        }
        return p;}}
