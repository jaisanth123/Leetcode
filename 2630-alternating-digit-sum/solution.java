class Solution {
    public int alternateDigitSum(int n) {
       int sum =0;
       int count = 0;
       int t=n;
       while(t>0){
        t/=10;
        count++;
       }

       boolean msb = (count%2==0)?false:true;
    
       while(n>0){
        int te =n%10;
        if(msb)
            sum+=te;
        else
            sum-=te;
        n/=10; 
        msb = !msb;
       }
       return sum;
    }
}
