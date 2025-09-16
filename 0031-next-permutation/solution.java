class Solution {
    public void nextPermutation(int[] nums) {
        int i, n = nums.length;
        for( i =n-2 ; i>=0 ;i--)
            {
                if(nums[i] < nums[i+1])
                break;
            }

        if(i>=0){
        int j = n-1;
        while (nums[j] <= nums[i]) {
            j--;
         }
        swap (nums , i , j);}
        
        reverse(nums,i+1,n-1);     
    }
    private void swap (int [] nums, int i , int j )
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums , int i , int j ){
        while (i < j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
        }
    }
}
