class Solution {
    public int passThePillow(int n, int time) {
            int pos = time % (2*(n-1));
            return pos < n ? pos+1 : ((n*2)-pos)-1;
    }
}
