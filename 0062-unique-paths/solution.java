class Solution {
    public int uniquePaths(int m, int n) {
        int [][] up = new int [m][n];
        for(int i = 0 ; i < m ;i++){
            up[i][0]=1;
        }
        for(int j = 0 ; j < n ; j++ ){
            up[0][j]= 1;
        }
        for(int i = 1 ; i<m ; i++){
            for (int j = 1 ; j < n ;j++){
                up[i][j] = up[i-1][j]+up[i][j-1];
            }

        }

        return up[m-1][n-1];
    }
}
