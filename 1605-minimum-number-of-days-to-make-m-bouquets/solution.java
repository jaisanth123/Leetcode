class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<((long)m*k))
            return -1;
    
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for(int i : bloomDay){
            if(i<left)
                left=i;
            if(i>right)
                right=i;
        }
        int ans = right;
        while (left <= right){
            int mid = (left+right) /2;
            if(possible(bloomDay,mid,m,k)){
            
                right = mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    //     for(int i = left ; i <=right ; i++){
    //         if(possible(bloomDay,i,m,k)){
    //             return i;
    //         }
    //     }
    // return -1;
    // }
    

    private boolean possible (int []arr , int day , int m , int k){
        int counter =0,total=0 ;
        for(int i : arr){
            if(i<=day){
                counter++;
                if(counter==k){
                    total++;
                    counter=0;
                }
                }
            else{
                counter=0;
            }
        }
        return total>=m;
    }
}
