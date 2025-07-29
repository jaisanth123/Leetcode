class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int arr[] = new int [n];
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(index[i],nums[i]);
        }

        int i = 0 ;
        for(int nu : list)
            arr[i++] = nu;

        return arr;
        
    }
}