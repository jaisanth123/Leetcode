class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int [] arr = new int [58];
        for(int i : stones.toCharArray()){
            arr[i-'A'] +=1;   
        }
        int j = 0 ;
        for(int i : jewels.toCharArray()){
            j+=arr[i-'A'];

        }

        return j;

        
    }
}
