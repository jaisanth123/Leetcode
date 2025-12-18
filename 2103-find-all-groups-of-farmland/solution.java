class Solution {
    public int[][] findFarmland(int[][] land) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < land.length ; i++) {
            for(int j = 0 ; j < land[0].length ; j++) {
                if(land[i][j]==1){
                    List<Integer> arr= new ArrayList<>();
                    arr.add(i);
                    arr.add(j);
                    dfs(i , j ,arr,land,i,j);
                    res.add(new ArrayList<>(arr));
                }}}
        int [][] resarr = new int[res.size()][4];
        for(int i = 0 ; i < resarr.length; i++){
            resarr[i][0]= res.get(i).get(0);
            resarr[i][1]= res.get(i).get(1);
            resarr[i][2]= res.get(i).get(2);
            resarr[i][3]= res.get(i).get(3);}
        return resarr;}


        
    private void dfs(int i , int j ,List<Integer>arr,int[][]land,int mi , int mj)
    {
        if(i<0 || j<0 || i>=land.length || j>=land[0].length || land[i][j]==0)
            return ;
        if(i>mi || j>mj){
            mi=i;
            mj=j;}
        if(i< mi || j<mj)
        {
            land[i][j]=0;
            return;
        }
        land[i][j]=0;
        dfs(i+1,j,arr,land,mi,mj);
        dfs(i-1,j,arr,land,mi,mj);
        dfs(i,j+1,arr,land,mi,mj);
        dfs(i,j-1,arr,land,mi,mj);
        arr.add(mi);
        arr.add(mj);
    }}
