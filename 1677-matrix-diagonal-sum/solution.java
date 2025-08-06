class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int s = 0;
        for(int i = 0 ; i < n ; i++){
            s +=( mat[i][i] + mat[(n-1)-i][i]) ; 
        }
        if(n%2 == 1)
            s-= mat[n/2][n/2];
        return s;
        
    }
}
