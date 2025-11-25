class Solution {

    private int cs(int memo[] , int n ){
        if(memo[n] != -1 )
            return memo[n];
        if(n<=2)
            return n;
        return memo[n] = cs(memo,n-1)+cs(memo,n-2);
    }

    public int climbStairs(int n) {
    int [] dp = new int [n+1];
    if(n<=2)
        return n;
    dp[1] =1;
    dp[2]=2;
    for(int i = 3 ; i <= n ; i++){
        dp[i] = dp[i-1]+dp[i-2];
    }
    return dp[n];
    }
    
}
