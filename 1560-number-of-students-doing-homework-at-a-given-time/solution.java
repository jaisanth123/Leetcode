class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum = 0 ;
        int count = 0 ;
        for( int i  =0 ; i < endTime.length ;i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime)
                 count++ ;
        }
     return count;           
        
    }
}
