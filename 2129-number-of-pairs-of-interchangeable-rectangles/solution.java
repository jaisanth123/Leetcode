class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap <Double,Integer> map = new HashMap<>();
        long c=0;
        for(int[] i:rectangles){
            double r = (double) i[0]/ i[1];
            c+= map.getOrDefault(r,0);
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return c;

    }
}
