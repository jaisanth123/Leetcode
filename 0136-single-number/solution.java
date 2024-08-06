class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
        if(hm.containsKey(i)){
            int val=hm.get(i);
            hm.put(i,val+1);
        }
        else{
            hm.put(i,1);
        }
    }
    int t =0;
    for(int i:nums ){
        if(hm.get(i)==1){
            t =i;
        }
    }
    return t ;
        
    }}

