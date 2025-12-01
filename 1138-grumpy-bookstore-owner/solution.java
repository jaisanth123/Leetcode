class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int always =0;
        int n = customers.length;
        for(int i =0 ; i < n ; i++){
            if(grumpy[i] ==0)
                always+=customers[i];
        }

        int extra = 0;
        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i]==1)
                extra+=customers[i];
        }
        int maxextra = extra;
        for(int i = minutes ; i < n ; i++){
            if(grumpy[i]==1)
                extra+=customers[i];
            if(grumpy[i-minutes]==1)
                extra-=customers[i-minutes];
            if(extra>maxextra)
                maxextra=extra;
        }
        return always+maxextra;
    }
}
