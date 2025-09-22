class Solution {
    public int rob(int[] nums) {
       int memo[] = new int [nums.length] ;
       Arrays.fill(memo,-1);
       return robb(nums,memo,nums.length-1);
    }
    private int robb(int[] nums , int[]memo , int n){
        if(n<0) return 0;

        if(memo[n] != -1)
            return memo[n];

        return memo[n]=Math.max(nums[n]+robb(nums,memo,n-2),robb(nums,memo,n-1));
    }
}
