class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE ;
        for(int i : nums){
                if (min > i)
                    min =i;
        }
        return min;
        
    }
}
