class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0;
        int s2=0;
        for(int i:nums) {
            s1+=i;
            while(i>0){
                int digit = i%10;
                s2+=digit;
                i/=10;
            }
        }
        return Math.abs(s1-s2);
        
    }
}
