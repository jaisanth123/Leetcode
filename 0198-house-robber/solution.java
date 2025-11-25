class Solution {
    private int helper(int memo[] , int nums [] , int n ){
    
        if(n <0)
            return 0;
        if(memo[n]!=-1)
            return memo[n];
        return memo[n]= Math.max(helper(memo,nums,n-1),nums[n]+helper(memo,nums,n-2));
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int memo []= new int [n+1];
        Arrays.fill(memo,-1);
        return helper(memo , nums ,n-1);
        
    }
}
