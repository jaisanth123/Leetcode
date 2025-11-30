class Solution {
    int i = 0 ; 
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper (1 ,n, k , res ,arr );
        return res ; 
    }
    private void helper (int start ,int n , int k , List<List<Integer>> res , List<Integer> arr ){
        if(arr.size()==k)
        {
            res.add(new ArrayList<>(arr));
            return;
        }

            for(int i = start ; i <= n ; i++ ){
                arr.add(i);
                helper(i+1 ,n, k , res , arr);
                arr.remove(arr.size()-1);
        }
    }
}
