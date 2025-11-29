class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
     List<List<Integer>> res = new ArrayList<>();
     List<Integer> arr = new ArrayList<>();
     Map<Integer,Integer> map = new HashMap<>();
     for(int i :nums){
        map.put(i,map.getOrDefault(i,0)+1);
     }
      helper (nums,res , arr , map);
      return res;
    }
    private void helper(int[] nums,List<List<Integer>> res,List<Integer> arr,Map<Integer,Integer> map){
        if(arr.size() == nums.length){
            res.add(new ArrayList<>(arr));
            return ;
            }
        else{
        for(Integer i: map.keySet()){
            int count = map.get(i);
            if(count==0)
                continue;
            arr.add(i);
            map.put(i,count-1);
            helper (nums,res , arr , map);
            arr.remove(arr.size()-1);
            map.put(i,count);

        }}
    }
}
