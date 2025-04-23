class Solution {
    public int maxProfit(int[] prices) {
        int b = prices[0];
        int p = 0 ;
        for(int i : prices){
            if(i < b){
                b = i ;
            }
            p = Math.max(p , (i-b));
        }

     return p;
        }}
