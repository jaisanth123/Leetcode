class Solution {
    public int arraySign(int[] nums) {
        int nc=0;
        for(int i : nums){
            if (i == 0)
             return 0;
            if(i<0) nc++;
        }

        if(nc%2 ==0)
        return 1;
        else
        return -1;


        
    }
}
