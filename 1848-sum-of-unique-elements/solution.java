class Solution {
    public int sumOfUnique(int[] nums) {
        int count [] = new int [101];
        for(int i:nums)
            count[i]++;
        int s =0 ;
        for(int i= 0 ; i <= 100;i++)
        {
            if(count[i]==1){
                s+=i;
            }
        }
        return s;


        
    }
}
