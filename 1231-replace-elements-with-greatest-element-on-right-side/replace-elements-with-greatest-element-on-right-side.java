class Solution {
    public int[] replaceElements(int[] arr) {
            int rmax=-1;
            for(int i = arr.length-1 ;i >=0  ; i--){
                int temp = arr[i];
                arr[i]=rmax;
                if(temp> rmax )
                    rmax=temp;
            }
    
        return arr;
    }
}