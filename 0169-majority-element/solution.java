class Solution {
    public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = nums[0];
            for(int i =1 ; i<nums.length ; i++){
                int x = nums[i];
                if(count == 0 && x!= candidate)
                    candidate =x;
                else if(x == candidate)
                    count++;
                else 
                    count--;
            }    
            return candidate;
    }
}
