class Solution {
    public int removeDuplicates(int[] nums) {
       int count =1;
       int j = 0;
       for(int i = 1; i < nums.length;i++){
        if(nums[i] != nums[j])
        {
            count++;
            j++;
            nums[j] = nums[i];
    
        }
       }
       return count;
    }
}
