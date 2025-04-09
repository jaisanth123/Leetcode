class Solution {
    public int majorityElement(int[] nums) {
        int maxcount = 0 ;
        int element=0 ;
        for(int i = 0 ; i < nums.length;i++){
            int count = 0 ; 
            for(int j = i ; j < nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(maxcount<count){
                maxcount=count;
                element = nums[i];
            }
        }
        return element;
    }
}
