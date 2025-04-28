class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for(int i = left ; i<=right ;i++){
            boolean isPrime = false;
            int sb = Integer.bitCount(i);
            if(sb>1){
                for(int j = 2 ; j <= sb/2 ;j++){
                    if(sb%j==0){    
                        isPrime=true;
                    }

                }
                if(!isPrime)
                    count++;
            }
               
        }
        return count;
    }
}
