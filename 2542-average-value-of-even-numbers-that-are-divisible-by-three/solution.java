class Solution {
    public int averageValue(int[] nums) {
        int s =0;
        int c=0;
        for(int i :nums){
            if(i%6==0){
                c++;
                s+=i;}
        }
        if(c==0)
            return 0;
        return s/c;
    }
}
