class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int pos = 0 ;
        int leftmax = -1;
        while(n !=0){
            pos++;
            if((n&1) == 1){
                if(leftmax!=-1)
                    max = Math.max(max , pos-leftmax);
                leftmax = pos;
            }
            n >>=1;

        }
        return max;
    }
}
