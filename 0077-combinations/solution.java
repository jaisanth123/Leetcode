class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        backTrack(n , k , res, comb , 1);
        return res;
        
    }

    private void backTrack(int n , int k , List<List<Integer>>res , List<Integer>comb, int current){
        if(comb.size() == k){
            res.add(new ArrayList<Integer>(comb));
            return ;}
        for(int i = current ; i <= n ; i++ ){
            comb.add(i);
            backTrack(n , k , res, comb , i+1);
            comb.remove(comb.size()-1);
        }
    }
}
