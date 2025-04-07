class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n];
   
        int count=0;
        for(int i = 2 ; i < n ; i++){
             if(arr[i]){
                continue;
             }
             else{
            for(int j =i+i  ; j < n ; j+=i){
                arr[j]= true;
                }

            }
        }
        for(int i = 2 ; i < n ; i++){
            if(!arr[i]){
                count++;
            }
        }
        return count;
    }
}
