class Solution {
   public int findMaxFish (int [][] grid) {
     int max=0;
      int size = 0 ;
      for(int i = 0 ; i < grid.length;i++){
       for(int j = 0 ; j < grid[0].length;j++){
           if(grid[i][j]!=0){
               size = dfs(i,j,grid);
               max=Math.max(max,size);}}}
      return max;
}
   private int dfs(int i , int j , int[][]g)
   {
       if(i<0 || j<0 || i>g.length-1 || j>g[0].length-1||g[i][j]==0)
           return 0;
        int temp = g[i][j];
       g[i][j]=0;
       return temp + dfs(i+1,j,g)+ dfs(i-1,j,g) + dfs(i,j+1,g) + dfs(i,j-1,g);
   }}
