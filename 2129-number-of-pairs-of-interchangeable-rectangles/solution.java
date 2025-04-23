class Solution {
    public long interchangeableRectangles(int[][] rect) {
            HashMap<Double,Integer> map = new HashMap<>();
            long count = 0 ;
            Double ratio = 0.0;
            for(int[] r : rect ){
                ratio = Double.valueOf(r[0]) / Double.valueOf(r[1]);
                    count += map.getOrDefault(ratio ,0);
                    map.put(ratio , map.getOrDefault(ratio ,0)+1);
                
            }
            return count;
    }
}
