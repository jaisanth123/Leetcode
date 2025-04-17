class Solution {
    public int reverse(int x) {
       int rem = 0 ;
       while (x != 0)
       {
        int digit = x%10;
        x/=10;
        if(rem > Integer.MAX_VALUE/10 || rem < Integer.MIN_VALUE/10 )
        return 0 ; 
        
        rem = rem*10 + digit ;
       } 
       return rem;
    }
}
