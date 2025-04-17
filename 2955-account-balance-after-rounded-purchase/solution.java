class Solution {
    public int accountBalanceAfterPurchase(int x) {

        int n = x%10;
        if (n<5){
            x -=n;
            return 100-x;
        }
        int t = 10-n;
        x +=t;
        return 100-x;


        
    }
}
