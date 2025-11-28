class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        helper(nums , res,arr,used);
        return res;
    
    }
    private void helper(int[] nums , List<List<Integer>> res , List<Integer> arr,boolean [] used){
        if(arr.size() == nums.length){
            res.add(new ArrayList<>(arr)); // to store it is new value if not when removing in res also removed since as referece added
            return;
        }
        else{
            for(int i = 0 ; i< nums.length;i++){
            if(used[i]) continue;
            used[i] = true;
            arr.add(nums[i]);
            helper(nums,res,arr,used);
            arr.remove(arr.size()-1);
            used[i] = false;
        }
    }}}

