class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum =Integer.MIN_VALUE , sum = 0 ;
        for(int i : nums){
            sum=sum+i;
             if(sum>maxsum)
                maxsum=sum;
            if(sum<0)
                sum=0;
           
      
        }
        return maxsum;
    }
}
