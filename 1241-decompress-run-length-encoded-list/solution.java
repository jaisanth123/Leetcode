class Solution {
    public int[] decompressRLElist(int[] nums) {
        List <Integer> arr = new ArrayList<>();
        for(int i =0 , j =i+1; i< nums.length-1 && j< nums.length; i+=2 , j+=2)
        {
            for(int t = 0 ; t< nums[i] ; t++){
                arr.add(nums[j]);
            }
        }
        int arrr[]  = new int [arr.size()];
        for(int i = 0 ; i < arr.size() ; i++) 
                arrr[i] = arr.get(i);
        return arrr;
   
    }


}
