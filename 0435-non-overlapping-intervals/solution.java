class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0 ;
        int endtime=Integer.MIN_VALUE;
        for(int [] i : intervals){
            if(i[0] < endtime)
                count++;
            else
            endtime = i[1];
        }
        return count;
        
    }
}
