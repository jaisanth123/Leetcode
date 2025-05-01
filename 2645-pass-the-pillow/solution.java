class Solution {
    public int passThePillow(int n, int time) {
        if(n>time)
            return time+1;
        
        boolean start = true ;
        while (time >=n){
            time -=n-1;
            start = !start;

        }
        if(start) return time+1;
        return n-time;
    }
}
