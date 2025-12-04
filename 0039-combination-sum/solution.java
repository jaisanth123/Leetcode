class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates , target , 0 , 0 , res , new ArrayList<>()  );
        return res;
    }
    private void helper(int [] candidates , int target ,int index , int total ,List<List<Integer>> res, List<Integer>comb ){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return ;
        }
        if(index >= candidates.length || total > target)
            return ;
        comb.add(candidates[index]);
        helper(candidates , target , index , total+candidates[index],res,comb);
        comb.remove(comb.size()-1);
        helper(candidates, target , index+1 , total,res,comb );
    }
}
