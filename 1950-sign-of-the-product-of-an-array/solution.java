class Solution {
    public int arraySign(int[] nums) {
        int nve=0;
        for(int i:nums){
            if(i==0)
                return 0;
            if(i<0)
                nve++;
        }
        if(nve%2==0)
            return 1;
        return -1;
    }
}
