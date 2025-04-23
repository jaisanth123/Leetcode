class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i : nums){
                map.put (i,map.getOrDefault(i,0)+1);
        }

        int mc = 0;
        int mj = 0 ;
        for(int i : map.keySet()){
            if(map.get(i)>mc){
                mc=map.get(i);
                mj=i;
            }
        }
        return mj;
    
        // int res = 0 , maj = 0;
        // for(int i :nums){
        //     if(maj==0)
        //         res= i ;
        //     if(maj==i)
        //         maj++;
        //     else
        //         maj--;
        // }
        
        
        // return res;
    }
}
