class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i:nums){
            if(hm.containsKey(i)){
                int val=hm.get(i);
                hm.put(i,val+1);
            }
            else{
                hm.put(i,1);
            }
        }
        int ty=0;
        int max=0;
        for(int i:hm.keySet()){
            int c= hm.get(i);
            if(c>max){
                max=c;
                ty=i;
            }
        }
        return ty;
        
    }
}
