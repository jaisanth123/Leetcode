class Solution {
    public int numberOfSteps(int num) {
    int c = 0 ;
    while (true){
        if(num ==0 ){
            break;
        }
       num= (num%2==0)?(num/2):(num-1);
        c++;
    }    
    return c;
    }
}
