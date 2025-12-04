class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = candidates.length;
        Arrays.sort(candidates);
        helper(candidates,target,0,res,new ArrayList<>(),n);

        return res;
    }
    private void helper(int[] candidates , int target , int index , List<List<Integer>> res , List<Integer> comb,int n){
        if(target==0){
            res.add(new ArrayList<>(comb));
            return;
            }
        
        if(target<0 || index >= n)
            return;
        for(int i = index ; i < n ; i++ ){
             if(i>index && candidates[i]==candidates[i-1])
            continue;
            if(candidates[i] > target)
            return;

        comb.add(candidates[i]);
        helper(candidates,target-candidates[i],i+1,res,comb,n);
        comb.remove(comb.size() -1);
        }
    }
}
