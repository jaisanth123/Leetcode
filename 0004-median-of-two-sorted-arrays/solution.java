class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length + nums2.length];
        int j = 0;
        for(int i : nums1){
            arr[j] = i;
            j++;
        }
        
        for(int i : nums2){
            arr[j] = i;
            j++;
        }

        Arrays.sort(arr);
        double avg ;
        int len = arr.length;
        if(len%2 ==1 ){
            return (double) arr[len/2];
        }
        else{
            int mid1 = arr[len/2 - 1];
            int mid2 = arr[len/2];
            return ((double) mid1 + (double)mid2)/2.0;
        }
        
    
    // return Math.round(avg*100000.0)/100000.0;
    }
}
