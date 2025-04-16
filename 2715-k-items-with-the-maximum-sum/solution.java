class Solution {
    public int kItemsWithMaximumSum(int x, int y, int z, int k) {
    return (k<=x)?k:k<(x+y)?x:x-(k-x-y);
    
    }}
