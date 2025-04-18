class Solution {
    public int countOdds(int l, int h) {

    int c = (h-l)/2;

    if(((l & 1)!=0 )|| ((h & 1) != 0 )){
        c++;
    }
    return c;

        
        
    }
}
