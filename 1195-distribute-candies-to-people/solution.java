class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] arr = new int [num_people];
       for(int g = 0 ; candies >0; candies -=g)
        arr[g%num_people] += Math.min(candies ,++g);
    return arr;
    }
}
