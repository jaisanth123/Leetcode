class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // for(int i = m,j=0 ; i <m+n;i++,j++){
        //     nums1[i] = nums2[j];
        // }
        // Arrays.sort(nums1);
        int i = m-1 ;
        int j = n-1;
        int k = m+n-1;
        while (j>=0){
            if(i >= 0 && nums1[i]>nums2[j])
                nums1[k--] = nums1[i--]; 
            else
                nums1[k--] = nums2[j--];

        }
    }
}
