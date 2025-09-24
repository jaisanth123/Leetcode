class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums , res , comb , 0);
        return res;
    }
    private void backTrack (int []nums ,List<List<Integer>> res, List<Integer> comb , int current){
       res.add(new ArrayList<Integer> (comb));
       for(int i = current ; i <nums.length ; i++){
        if(i>current && nums[i] == nums[i-1])
            continue;
        comb.add(nums[i]);
        backTrack(nums , res , comb , i+1);
        comb.remove(comb.size()-1);
       } 
    }
}
