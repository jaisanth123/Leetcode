class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int x = 1 ;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]<=0){
                continue;
            }   
            if(nums[i]>x){
                return x;
            }
            x = nums[i]+1;
        }
        return x;        
    }
}
