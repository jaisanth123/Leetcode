class Solution {
    public int findPeakElement(int[] nums) {
        int t=0;
        if(nums.length<=2){
            if(nums.length==1){
                return 0;
            }
            else if(nums[0]>nums[1]){
                return 0;
            }
            else if(nums[0]<nums[1]){
                return 1;
            }
 }
        else {
        for(int i = 1; i <nums.length-1;i++){
            if (nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                t= i;

            }
            }
            if(t==0){
                if(nums[nums.length-1]>nums[nums.length-2]){
                    t=nums.length-1;
                }
            }
        }
    
    return t;
        
    
}}
