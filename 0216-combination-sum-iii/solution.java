class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(k,n,res,new ArrayList<>(),1);
        return res;
    }
    private void helper(int k , int n , List<List<Integer>> res , List<Integer> comb , int ind){
        if(n==0 && comb.size()==k)
        {
            res.add(new ArrayList<>(comb));
            return;
        }
        if(n<0)
            return ;
        for(int i = ind; i <=9 ; i++){
            if(i>n)
                continue;
            comb.add(i);
            helper(k,n-i,res,comb,i+1);
            comb.remove(comb.size()-1);
        }
        
    }
}
