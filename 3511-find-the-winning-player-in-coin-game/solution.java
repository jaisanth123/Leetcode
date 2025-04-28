class Solution {
    public String winningPlayer(int x, int y) {
        int mt =0 ;
        while(x>=1 && y>=4){
            mt++;
            x--;
            y-=4;
        }

        if(mt%2==0)
            return "Bob";
        return "Alice";
    }
}
