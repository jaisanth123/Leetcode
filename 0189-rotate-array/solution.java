class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int r = n-k-1;
        if(n==1)
            return ;
        reverse(nums,0,r);
        reverse(nums,r+1,n-1);
        reverse(nums,0,n-1);
    }

    private void reverse(int[] nums , int l , int r)
    {
        while(l<r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
