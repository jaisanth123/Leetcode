class Solution {
    public int[] leftRightDifference(int[] nums) {
    int [] li=new int[nums.length];
for ( int i =0 ; i < nums.length;i++){
    int s=0;

    if(i==0){
        for(int j =1 ; j < nums.length ;j++){
            s+=nums[j];
        }
        li[0]=s;
    }
    else if(i==nums.length-1){
        for(int l =0 ; l < nums.length-1;l++){
            s+=nums[l];
        }
        li[nums.length-1]=s;
    }
    else{
        int rsum=0,lsum=0;
        for(int k = i+1 ; k < nums.length;k++){
             rsum += nums[k];}

        for( int q =0 ; q < i ; q++){
            lsum+=nums[q];}
        s=Math.abs(lsum-rsum);
        li[i]=s;
        

    }
    
    
    
    }
    return li;
    }
}
