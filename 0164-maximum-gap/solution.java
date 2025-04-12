class Solution {
    public int maximumGap(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       if(n <= 1){
        return 0;
       } 
       int m = 0 ;
       for(int i = 0 ; i < n-1 ; i++){
        int r = nums[i+1] - nums[i];
        m = Math.max(r , m);
       }
       return m;
    }
}
