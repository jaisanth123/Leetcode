class Solution {
    public int hammingWeight(int n) {

        int count = 0 ; 
        int temp = n ;
        while (temp !=0 ){
            count += temp & 1 ; 
            temp >>>=1;
        }
        int c = Integer.bitCount(n);
        return c;
    }
}
