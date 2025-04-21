class Solution {
    public void rotate(int[] nums, int k) { 
        int n = nums.length;
        int rot = k%n;
        rotateArray(nums,0,n-1);
        rotateArray(nums,0,rot-1);
        rotateArray(nums,rot,n-1);
    
    }

    public int[] rotateArray(int []arr , int start , int stop){
        while (start<stop){
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp ;
            start++;
            stop--;
        }
        return arr;
    }
}
