class Solution {
    public int maxAreaOfIsland(int [][] grid) {
      int max=0;
       int size = 0 ;
       for(int i = 0 ; i < grid.length;i++){
        for(int j = 0 ; j < grid[0].length;j++){
            if(grid[i][j]==1){
                size = dfs(i,j,grid,0);
                max=Math.max(max,size);
            }
            
        }
            } 
       return max;}
    private int dfs(int i , int j , int[][]g,int size)
    {
        if(i<0 || j<0 || i>g.length-1 || j>g[0].length-1||g[i][j]==0)
            return 0;
        g[i][j]=0;
        return 1 + dfs(i+1,j,g,size)+ dfs(i-1,j,g,size) + dfs(i,j+1,g,size) + dfs(i,j-1,g,size);
    
    }}
