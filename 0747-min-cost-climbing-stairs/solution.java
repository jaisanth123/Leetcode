class Solution {

    private int helper(int cost[] , int memo[] , int n){
        if(n<0)
            return 0;
        if(n<=1)
            return cost[n];
        if(memo[n]!=-1)
            return memo[n];
       return memo[n] =cost[n] + Math.min(helper(cost,memo,n-1),helper(cost,memo,n-2)); 
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int dp[] = new int [n];
        // Arrays.fill(memo,-1);
        // return Math.min(helper(cost,memo,n-1),helper(cost,memo,n-2));
        // dp[0]=cost[0];
        // dp[1] = cost[1];
        for(int i = 2 ; i< n ; i++){
            // dp[i] = cost[i]+Math.min(dp[i-1], dp[i-2]);
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[n-1],cost[n-2]);
    }
}
