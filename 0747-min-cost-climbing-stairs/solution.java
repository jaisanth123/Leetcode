class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int memo[] = new int[cost.length+1];
        Arrays.fill(memo,-1);
       return Math.min(helper(memo,0,cost),helper(memo,1,cost));
    }
    private static int helper(int [] memo ,int n, int[] cost )
    {
        if(n>= cost.length)
            return 0;
        if(memo[n]!= -1)
            return memo[n];

        return memo[n] = cost[n]+Math.min(helper(memo,n+1,cost),helper(memo,n+2,cost));
    }

}
