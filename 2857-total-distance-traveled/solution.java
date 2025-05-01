class Solution {
    public int distanceTraveled(int mt, int at) {
        if(mt<5)
            return mt*10;
       int total =0;
       while(mt>=5) {
        total+=5;
        if(at!=0){
            mt-=4;
            at--;}
        else
        mt-=5;
       }
       total+=mt;
       return total*10;
    }
}
