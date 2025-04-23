class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length-1 , area = 0;
        while (left < right){
            int h = Math.min(height[left] , height[right]);
            int width = right - left;
            area = Math.max(area, width*h);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }    
        return area;
        
    }
}
