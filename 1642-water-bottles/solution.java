class Solution {
    public int numWaterBottles(int nb, int ne) {
        int cb = nb;
    
        while(nb>=ne){
            cb+=nb/ne;
            nb= nb%ne + nb/ne;
        }
        return cb;
    }
}
