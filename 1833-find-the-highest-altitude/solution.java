class Solution {
    public int largestAltitude(int[] gain) {

        int sum = 0 ;
        int max = sum ;
        for(int i : gain ){
            sum +=i ;
            if(max < sum )
                max = sum;
        }
        return max;
        
    }
}
