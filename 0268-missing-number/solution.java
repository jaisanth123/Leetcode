class Solution {
    public int missingNumber(int[] nums) {
            int sum = 0 ;
            for(int i : nums){
                sum+= i;
            }
            int n = nums.length;
            int rsum = (n*(n+1))/2;
            return rsum-sum;
        
    }
}
