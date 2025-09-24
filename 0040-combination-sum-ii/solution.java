class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates , target , res , comb , 0);
        return res;

    }
    private void backTrack(int[] candidates, int target, List<List<Integer>> res,List<Integer> comb , int c)
    
    {
        if (target == 0)
            {
                res.add(new ArrayList<Integer>(comb));
                return ;
            }
        if(target < 0)
            return ;
    
        for(int i=c ; i < candidates.length ; i++){
            
            if(i>c && candidates[i]== candidates[i-1])
                continue;
            if(candidates[i]> target)
                return;
            comb.add(candidates[i]);
            backTrack(candidates , target-candidates[i],res , comb , i+1);
            comb.remove(comb.size() -1);
            

        }
        
    }
}
