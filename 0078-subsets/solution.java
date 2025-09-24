class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        backtrack(nums , res, combi , 0 );
        return res;
    }

    private void backtrack(int [] nums , List<List<Integer>> res , List<Integer>combi, int c   ){

        res.add(new ArrayList<Integer>(combi));

        for(int i = c ; i < nums.length ; i++){
            combi.add(nums[i]);
            backtrack(nums , res, combi , i+1 );
            combi.remove(combi.size()-1); 
        }
    }
}
