class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr,-1);
        return  helper(arr,n-1,nums);
    }
    public int helper(int[]arr , int n,int[]nums){
        if(n<0)
            return 0;
        if(arr[n] !=-1)
            return arr[n];
        return  arr[n]=Math.max(helper(arr,n-1,nums),nums[n]+helper(arr,n-2,nums));
    }
}
