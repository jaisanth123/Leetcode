class Solution {
   
    public int majorityElement(int[] nums) {
        return helper(nums,0,nums[0],nums.length);
    }
    private int helper(int [] nums , int si , int ref,int n)
    {   
        int c =0;
        for(int i = si ; i < n;i++ )
        {
            if(nums[i]==ref)
                c++;
            else 
                c--;
            if(c==-1)
                return helper(nums,i,nums[i],n);
        }
        return ref;
    }
}
