class Solution {
    private int helper(int nums[], int memo[],int start, int n){
        if(n <0)
            return 0;
        if(n<start)
            return 0;
        

        if(memo[n]!=-1)
            return memo[n];

        return memo[n] = Math.max(helper(nums,memo,start,n-1), nums[n]+helper(nums,memo,start,n-2));
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        if (n==2)
            // return nums[0];
            return Math.max(nums[0],nums[1]);
        int dp1[] = new int [n];
        int dp2[] = new int[n];
        // Arrays.fill(dp2,-1);
        // Arrays.fill(dp1,-1);
        // return Math.max(helper(nums,memo1,1,n-1),helper(nums,memo2,0,n-2));
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0],nums[1]);
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1],nums[2]);
        for(int i = 2 ; i < n-1 ;i++)
           dp1[i]= Math.max(dp1[i-1],nums[i]+dp1[i-2]);
        for(int i = 3 ; i < n ;i++)
           dp2[i]= Math.max(dp2[i-1],nums[i]+dp2[i-2]);
        
        return Math.max(dp1[n-2], dp2[n-1]);
    }
}
