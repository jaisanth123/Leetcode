class Solution {
    public void rotate(int[] nums, int k) { 
        int n = nums.length;
        int  []res = new int [n];
        System.arraycopy(nums,0,res,0,n);
        for(int i = 0 ; i < n ; i++){
                 nums[(i+k)%n]   =res[i];
        }
        
    }
}
