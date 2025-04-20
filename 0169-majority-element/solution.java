class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1); 
        }   

        int maxcount = 0 ;
        int majorityelement = -1;
        for(int i : map.keySet()){
            if(map.get(i) > maxcount){
                maxcount= map.get(i);
                majorityelement = i;
            }
        }
        return majorityelement;
    }
}
