class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        if( nums.length < 2){
            arr.add(nums[0]);
            return arr;
        }
        int cand1=0, cand2=0, count1=0,count2=0;
        for(int x:nums){
            if(count1 == 0 && cand2!=x)cand1=x;
            else if(count2==0 && cand1 != x) cand2=x;
            if(cand1 ==x) count1++;
            else if(cand2 ==x) count2++;
            else {count1--; count2--;}

        }
        count1=0; count2=0;
        for(int i : nums){
            if(cand1==i)count1++;
            else if(cand2==i) count2++;
        }
        if(count1>nums.length/3)arr.add(cand1);
        if(count2>nums.length/3)arr.add(cand2);
        return arr;
    }
}
