class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i =0;
        for (String j:operations){
            if(j.equals("X++") || j.equals("++X")){
                i+=1;
            }
            else if (j.equals("--X") || j.equals("X--")){
                i-=1;
            }
        }
        return i;
    }
}
