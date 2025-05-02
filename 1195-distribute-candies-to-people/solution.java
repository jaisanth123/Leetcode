class Solution {
    public int[] distributeCandies(int candies, int np) {
        int [] arr = new int [np];
        for(int g=0;candies>0;candies-=g)
            arr[g%np] += Math.min(candies,++g);
        return arr;
    }
    
}
