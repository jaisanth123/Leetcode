void rotateArray(int* nums ,int x , int y){
    while (y > x){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
        x++;
        y--;        
    }

}

void rotate(int* nums, int numsSize, int k) {
   int t = k %numsSize;
   rotateArray(nums , 0 , numsSize-1); 
   rotateArray(nums , 0 , t-1); 
   rotateArray(nums , t , numsSize-1); 
}

