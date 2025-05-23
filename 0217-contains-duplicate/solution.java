class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set <Integer> hset = new HashSet<>();
       for(int i : nums){ 
            if(!hset.add(i))
                return true ; 
       }
                return false ; 
    }
}
