class Solution {
    public int[][] merge(int[][] intervals) {
       List<List<Integer>>  res = new ArrayList<>();
       Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
       int start = intervals[0][0];
       int end = intervals[0][1];
       for(int i=1 ; i < intervals.length ; i++){
          if(intervals[i][0]<= end) {
            end = Math.max(end,intervals[i][1]);
          }
          else{
            res.add(Arrays.asList(start,end));
            start = intervals[i][0];
            end = intervals[i][1];
          }
    }
    res.add(Arrays.asList(start,end));
    int arr[][] = new int[res.size()][2];
    for(int i=0 ; i < res.size();i++){
        List<Integer> x = res.get(i);
        arr[i][0] = x.get(0);
        arr[i][1] = x.get(1);
    }
        return arr;
    }}
