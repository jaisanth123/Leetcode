class Solution {
    public int numIslands(char[][] grid) {
       int count = 0 ;
       for(int i = 0 ; i < grid.length;i++){
        for(int j = 0 ; j < grid[0].length;j++)
        {
            if(grid[i][j]=='1')
            {
                dfs(i,j,grid);
                count++;
            }
        }
       } 
       return count;
    }
    private void dfs(int i , int j , char[][]g)
    {
        if(i<0 || j<0 || i>g.length-1 || j>g[0].length-1||g[i][j]=='0')
            return;
        g[i][j]='0';
        dfs(i+1,j,g);
        dfs(i-1,j,g);
        dfs(i,j+1,g);
        dfs(i,j-1,g);
    }
}
