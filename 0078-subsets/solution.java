class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(nums,res,arr,0);
        return res;
    }
    private void helper (int [] nums , List<List<Integer>> res , List<Integer> arr , int start)
    {
        res.add(new ArrayList<>(arr));
        if(start>=nums.length)
            return;
        for(int i = start ; i<nums.length;i++){
                arr.add(nums[i]);
                helper(nums,res,arr,i+1);
                arr.remove(arr.size()-1);
        }
    }
    }
