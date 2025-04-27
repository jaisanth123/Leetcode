class Solution {
    public boolean isPalindrome(int x) {
        int res =0;
        int temp=x;
        while(x>0){
            int digit = x%10;
            res = res*10+digit;
            x/=10;
        }
        return temp==res;
        
    }
}
