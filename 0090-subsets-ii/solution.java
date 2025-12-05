class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,res,comb,0);
        return res;
    }
    private void helper(int[] nums , List<List<Integer>> res , List<Integer> comb, int start){
    
        res.add(new ArrayList<>(comb));
        for(int i = start ; i < nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
                continue;
            comb.add(nums[i]);
            helper(nums,res,comb,i+1);
            comb.remove(comb.size()-1);
        }
    }
}
