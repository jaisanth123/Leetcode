class Solution {
    public int numWaterBottles(int nb, int ne) {
        int c = nb;
        int ep = nb ;
        while (ep >= ne ){
            c+=ep/ne;
            ep = ep % ne + ep/ne;
   }
   return c;
   }
}
