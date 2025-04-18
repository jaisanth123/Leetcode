class Solution {
    public int distanceTraveled(int mt, int at) {
        int ans = 0 ;
        for(int i = 1 ; i<=mt;i++){
            if (at!=0 && i%5==0){
                at-=1;
                mt+=1;}
                ans+=10;
        }

    return ans;

    // return (mt+ min(mt-1/4,at))*10;

    }
}
