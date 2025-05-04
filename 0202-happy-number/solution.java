class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        while (!(visit.contains(n))){
            visit.add(n);
            n = squaresum(n);
            if (n==1)
                return true;  
        }
        return false;
    }
    private int squaresum (int n ){
        int t=0;
        while(n>0){
            int d = n%10;
            t+= d*d;
            n/=10;
        }
        return t;
    }
}
