class Solution {
    public int maxSubArray(int[] nums) {

    if(nums==null || nums.length==0 ) return 0;
    int cmax = nums[0];
    int gmax = nums[0];
    for(int i =1 ; i < nums.length;i++){
        cmax = Math.max(nums[i],cmax+nums[i]);
        gmax = Math.max(cmax,gmax);
    }
    return gmax;
    }
}
