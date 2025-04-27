class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = Integer.MIN_VALUE;
        for(int i : piles){
            if(i>right)
                right=i;
        }
        while(left<right){
            int mid = (left+right)/2;
            if(canEat(piles,h,mid))
                right=mid;
            else
                left = mid+1;
        }
        return left;
        
    }
    private boolean canEat(int[] arr , int h , int mid){
        int hours = 0;
        for(int i :arr){
            hours+= (i+mid-1)/mid;
        }
        return hours<=h;
    }
}
