class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod =1;
        int rev = 0 ;
        while (n != 0){
            int digit = n%10;
            sum += digit ;
            prod *= digit;
            n = n/10;
            
        }
        return prod-sum;
        
    }
}
