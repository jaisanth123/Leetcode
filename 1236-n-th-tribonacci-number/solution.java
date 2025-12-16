class Solution {
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n<=2)
            return 1;
        int dp[] = new int[n+1];
        dp[0] =0;
        dp[1]=1;
        dp[2]=1;
        for(int i = 3 ; i <= n ;i++)
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        return dp[n];
        
    }
    private int helper(int n , int[]memo)
    {
        if(memo[n]!=-1)
            return memo[n];
        if(n==0)
            return 0;
        if(n<=2)
            return 1;
        return memo[n] = helper(n-1,memo)+helper(n-2,memo)+helper(n-3,memo);
    }
}
